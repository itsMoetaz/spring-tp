package tn.esprit.gestionprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.repositories.EquipeRepository;

import java.util.List;
@AllArgsConstructor //tasna3 constructeur paramétré
@Service
public class EquipeServiceImp implements IEquipeService{
    private EquipeRepository equipeRepository;
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


}
