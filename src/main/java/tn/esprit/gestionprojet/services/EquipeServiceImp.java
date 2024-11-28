package tn.esprit.gestionprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.repositories.EquipeRepository;
import tn.esprit.gestionprojet.repositories.ProjetRepository;

import java.util.List;
@AllArgsConstructor //tasna3 constructeur paramétré
@Service
public class EquipeServiceImp implements IEquipeService{
    private EquipeRepository equipeRepository;
    private ProjetRepository projetRepository;
    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> getAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe getEquipeById(Long id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEquipeById(Long id) {
        equipeRepository.deleteById(id);
    }

    @Override
    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        // on set le fils dans le parent :
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);
    }

    @Override
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);
    }


}
