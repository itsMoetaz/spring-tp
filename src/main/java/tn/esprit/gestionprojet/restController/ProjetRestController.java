package tn.esprit.gestionprojet.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.services.IProjetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@Tag(name = "Gestion des projets")
public class ProjetRestController {
    @Autowired
    private IProjetService iProjetService;

    @PostMapping("/addProjet")
    @Operation(description = "ajouter des projets à la base de données")
    public Projet addProjet(@RequestBody Projet projet) {
        return iProjetService.addProjet(projet);
    }

    @PutMapping("/updateProjet")
    @Operation(description = "modifier des projets dans la base de données")
    public Projet updateProjet(@RequestBody Projet projet) {
        return iProjetService.updateProjet(projet);
    }

    @GetMapping("/getAllProjets")
    @Operation(description = "récupérer tous les projets de la base de données")
    public List<Projet> getAllProjets() {
        return iProjetService.getAllProjets();
    }

    @GetMapping("/getProjetById/{id}")
    @Operation(description = "récupérer projet par ID de la base de données")
    public Projet getProjetById(@PathVariable Long id) {
        return iProjetService.getProjetById(id);
    }

    @DeleteMapping("/deleteProjetById/{id}")
    @Operation(description = "supprimer projet par ID de la base de données")
    public void deleteProjetById(@PathVariable Long id) {
        iProjetService.deleteProjetById(id);
    }
}
