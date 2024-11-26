package tn.esprit.gestionprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.ProjetDetail;
import tn.esprit.gestionprojet.repositories.ProjetDetailRepository;

import java.util.List;
@AllArgsConstructor //tasna3 constructeur paramétré
@Service
public class ProjetDetailServiceImp implements IProjetDetailService {
        private ProjetDetailRepository projetDetailRepository;
    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public List<ProjetDetail> getAllProjetDetail() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail getProjetDetailById(Long id) {
        return projetDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProjetDetailById(Long id) {
        projetDetailRepository.deleteById(id);
    }
}
