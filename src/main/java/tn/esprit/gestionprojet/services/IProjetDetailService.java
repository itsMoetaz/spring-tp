package tn.esprit.gestionprojet.services;

import tn.esprit.gestionprojet.entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail);
    public List<ProjetDetail> getAllProjetDetail();
    public ProjetDetail getProjetDetailById(Long id);
    public void deleteProjetDetailById(Long id);
}
