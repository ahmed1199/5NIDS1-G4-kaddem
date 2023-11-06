package TestUnitaireEtudiant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.repositories.EtudiantRepository;
import tn.esprit.spring.khaddem.services.EtudiantServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class MyTestEtudiant {
    @InjectMocks
    private EtudiantServiceImpl etudiantService ;

    @Mock
    private EtudiantRepository etudiantRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testaddEtudiant() {
        Etudiant Etudiant = new Etudiant();
        Mockito.when(etudiantRepository.save(Etudiant)).thenReturn(Etudiant);
        Etudiant addedEtudiant = etudiantService.addEtudiant(Etudiant);
        Assertions.assertEquals(Etudiant, addedEtudiant);
    }
    @Test
    void testRetrieveEtudiant() {
        int idEtudiant = 1;
        Etudiant Etudiant = new Etudiant();
        Mockito.when(etudiantRepository.findById(idEtudiant)).thenReturn(Optional.of(Etudiant));

        Etudiant retrievedEtudiant = etudiantService.retrieveEtudiant(idEtudiant);

        Assertions.assertEquals(Etudiant, retrievedEtudiant);
    }

    @Test
    void testretrieveAllEtudiants() {
        List<Etudiant> Etudiants = new ArrayList<>();
        Mockito.when(etudiantRepository.findAll()).thenReturn(Etudiants);

        List<Etudiant> retrievedEtudiants = etudiantService.retrieveAllEtudiants();

        Assertions.assertEquals(Etudiants, retrievedEtudiants);
    }
    @Test
    void testRemoveEtudiant() {
        int idEtudiant = 1;
        Mockito.doNothing().when(etudiantRepository).deleteById(idEtudiant);

        etudiantService.removeEtudiant(idEtudiant);

        Mockito.verify(etudiantRepository, Mockito.times(1)).deleteById(idEtudiant);
    }

}
