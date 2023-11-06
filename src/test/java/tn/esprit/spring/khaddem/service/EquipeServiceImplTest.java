package tn.esprit.spring.khaddem.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.khaddem.entities.Equipe;
import tn.esprit.spring.khaddem.repositories.ContratRepository;
import tn.esprit.spring.khaddem.repositories.EquipeRepository;
import tn.esprit.spring.khaddem.services.EquipeServiceImpl;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

public class EquipeServiceImplTest {

    @InjectMocks
    private EquipeServiceImpl equipeService;

    @Mock
    private EquipeRepository equipeRepository;

    @Mock
    private ContratRepository contratRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testretrieveAllEquipes() {
        List<Equipe> equipeList = new ArrayList<>();
        // Remplissez la liste avec des données d'exemple

        when(equipeRepository.findAll()).thenReturn(equipeList);

        List<Equipe> result = equipeService.retrieveAllEquipes();

        assertEquals(equipeList.size(), result.size());
    }

    @Test
    public void testaddEquipe() {
        Equipe equipe = new Equipe();
        // Remplissez l'objet equipe avec des données d'exemple

        when(equipeRepository.save(equipe)).thenReturn(equipe);

        Equipe result = equipeService.addEquipe(equipe);

        assertEquals(equipe, result);
    }

    @Test
    public void testupdateEquipe() {
        Equipe equipe = new Equipe();
        // Remplissez l'objet equipe avec des données d'exemple

        when(equipeRepository.save(equipe)).thenReturn(equipe);

        Equipe result = equipeService.updateEquipe(equipe);

        assertEquals(equipe, result);
    }

    @Test
    public void testretrieveEquipe() {
        Integer idEquipe = 1;
        Equipe equipe = new Equipe();
        // Remplissez l'objet equipe avec des données d'exemple

        when(equipeRepository.findById(idEquipe)).thenReturn(Optional.of(equipe));

        Equipe result = equipeService.retrieveEquipe(idEquipe);

        assertNotNull(result);
        assertEquals(equipe, result);
    }
}

