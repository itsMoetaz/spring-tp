package tn.esprit.gestionprojet.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojet.entities.ProjetDetail;
import tn.esprit.gestionprojet.services.IProjetDetailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@Tag(name = "Gestion des détails des projets")
public class ProjetDetailRestController {
    @Autowired
    private IProjetDetailService iProjetDetailService;

    @PostMapping("/addProjetDetail")
    @Operation(description = "ajouter des détails de projets à la base de données")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return iProjetDetailService.addProjetDetail(projetDetail);
    }

    @PutMapping("/updateProjetDetail")
    @Operation(description = "modifier des détails de projets dans la base de données")
    public ProjetDetail updateProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return iProjetDetailService.updateProjetDetail(projetDetail);
    }

    @GetMapping("/getAllProjetDetails")
    @Operation(description = "récupérer tous les détails des projets de la base de données")
    public List<ProjetDetail> getAllProjetDetails() {
        return iProjetDetailService.getAllProjetDetail();
    }

    @GetMapping("/getProjetDetailById/{id}")
    @Operation(description = "récupérer les détails d'un projet par ID de la base de données")
    public ProjetDetail getProjetDetailById(@PathVariable Long id) {
        return iProjetDetailService.getProjetDetailById(id);
    }

    @DeleteMapping("/deleteProjetDetailById/{id}")
    @Operation(description = "supprimer les détails d'un projet par ID de la base de données")
    public void deleteProjetDetailById(@PathVariable Long id) {
        iProjetDetailService.deleteProjetDetailById(id);
    }
}
