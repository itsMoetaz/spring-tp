package tn.esprit.gestionprojet.services;

import tn.esprit.gestionprojet.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    public Equipe addEquipe(Equipe equipe);
    public Equipe updateEquipe(Equipe equipe);
    public List<Equipe> getAllEquipes();
    public Equipe getEquipeById(Long id);
    public void deleteEquipeById(Long id);
}
