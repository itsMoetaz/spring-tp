package tn.esprit.gestionprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.repositories.ProjetRepository;

import java.util.List;
@AllArgsConstructor //tasna3 constructeur paramétré
@Service
public class ProjetServiceImp implements IProjetService{
    private ProjetRepository projetRepository;
    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet getProjetById(Long id) {
        return projetRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProjetById(Long id) {
        projetRepository.deleteById(id);
    }
}
