package tn.esprit.spring.khaddem.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.khaddem.entities.Departement;
import tn.esprit.spring.khaddem.services.DepartementServiceImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DepartementServiceImplTest {

    @Autowired
    private DepartementServiceImpl departementService;

    @Test
    public void testretrieveAllDepartements() {
        // Assurez-vous que la liste n'est pas vide
        List<Departement> departements = departementService.retrieveAllDepartements();
        assertNotNull(departements);
        assertNotEquals(0, departements.size());
    }

    @Test
    public void testaddAndupdateDepartement() {
        // Créez un nouveau département
        Departement newDepartement = new Departement();
        newDepartement.setNomDepart("Nouveau Département");

        // Ajoutez le département
        Departement addedDepartement = departementService.addDepartement(newDepartement);
        assertNotNull(addedDepartement.getIdDepartement());

        // Modifiez le nom du département
        addedDepartement.setNomDepart("Département Modifié");
        Departement updatedDepartement = departementService.updateDepartement(addedDepartement);

        // Vérifiez que le département a été mis à jour avec succès
        assertEquals("Département Modifié", updatedDepartement.getNomDepart());
    }

    @Test
    public void testretrieveDepartement() {
        // Assurez-vous d'avoir un ID de département valide existant dans votre base de données
        Integer idDepartement = 1;
        Departement departement = departementService.retrieveDepartement(idDepartement);
        assertNotNull(departement);
    }


}

