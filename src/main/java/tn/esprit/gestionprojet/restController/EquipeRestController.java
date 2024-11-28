package tn.esprit.gestionprojet.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.services.IEquipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@Tag(name = "Gestion des equipes")
public class EquipeRestController {
    @Autowired
    private IEquipeService iEquipeService;

    @PostMapping("/addEquipe")
    @Operation(description = "ajouter des équipes à la base de données")
    public Equipe addEquipe(@RequestBody Equipe equipe) {
        return iEquipeService.addEquipe(equipe);
    }

    @PutMapping("/updateEquipe")
    @Operation(description = "modifier des équipes dans la base de données")
    public Equipe updateEquipe(@RequestBody Equipe equipe) {
        return iEquipeService.updateEquipe(equipe);
    }

    @GetMapping("/getAllEquipes")
    @Operation(description = "récupérer toutes les équipes de la base de données")
    public List<Equipe> getAllEquipes() {
        return iEquipeService.getAllEquipes();
    }

    @GetMapping("/getEquipeById/{id}")
    @Operation(description = "récupérer équipe par ID de la base de données")
    public Equipe getEquipeById(@PathVariable Long id) {
        return iEquipeService.getEquipeById(id);
    }

    @DeleteMapping("/deleteEquipeById/{id}")
    @Operation(description = "supprimer équipe par ID de la base de données")
    public void deleteEquipeById(@PathVariable Long id) {
        iEquipeService.deleteEquipeById(id);
    }

    @PutMapping("/affecter-equipe-a-projet/{equipeId}/{projetId}")
    @Operation(description = "affecter projet par ID ")
    public void affecgterEquipeAProjet(@PathVariable("equipeId") Long equipeId, @PathVariable("projetId") Long projetId) {
        iEquipeService.assignProjetToEquipe(equipeId, projetId);
    }

    @PutMapping("/desaffecter-projet-d'equipe/{equipeId}/{projetId}")
    @Operation(description = "desaffecter projet from equipe ")
    public void desaffecgterProjetFromEquipe(@PathVariable("equipeId") Long equipeId, @PathVariable("projetId") Long projetId) {
        iEquipeService.desaffecterProjetFromEquipe(equipeId, projetId);
    }
}
