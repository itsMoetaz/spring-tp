package tn.esprit.gestionprojet.services;

import tn.esprit.gestionprojet.entities.Projet;

import java.util.List;

public interface IProjetService {
    public Projet addProjet(Projet projet);
    public Projet updateProjet(Projet projet);
    public List<Projet> getAllProjets();
    public Projet getProjetById(Long id);
    public void deleteProjetById(Long id);
}
