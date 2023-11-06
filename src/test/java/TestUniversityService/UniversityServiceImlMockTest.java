package TestUniversityService;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.entities.Specialite;
import tn.esprit.spring.khaddem.entities.Universite;
import tn.esprit.spring.khaddem.repositories.ContratRepository;
import tn.esprit.spring.khaddem.repositories.UniversiteRepository;
import tn.esprit.spring.khaddem.services.ContratServiceImpl;
import tn.esprit.spring.khaddem.services.UniversiteServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class UniversityServiceImplMockTest {
    @InjectMocks
    private UniversiteServiceImpl universiteService;
    @Mock
    private UniversiteRepository universiteRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void testaddUniversite() {
        Universite universite = new Universite();
        Mockito.when(universiteRepository.save(universite)).thenReturn(universite);

        Universite addUniversite = universiteService.addUniversite(universite);

        Assertions.assertEquals(universite, addUniversite);
    }
    @Test
    void testretrieveUniversite() {
        int universityId = 1;
        Universite universite = new Universite();
        Mockito.when(universiteRepository.findById(universityId)).thenReturn(Optional.of(universite));

        Universite retrieveUniversite = universiteService.retrieveUniversite(universityId);

        Assertions.assertEquals(universite, retrieveUniversite);
    }
    @Test
    void testretrieveAllUniversites() {
        List<Universite> universites = new ArrayList<>();
        Mockito.when(universiteRepository.findAll()).thenReturn(universites);

        List<Universite> retrieveUniversite = universiteService.retrieveAllUniversites();

        Assertions.assertEquals(universites, retrieveUniversite);
    }

}
