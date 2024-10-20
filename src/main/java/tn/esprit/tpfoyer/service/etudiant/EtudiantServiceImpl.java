package tn.esprit.tpfoyer.service.etudiant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Etudiant;
import tn.esprit.tpfoyer.Repositories.EtudiantRepository;
import tn.esprit.tpfoyer.service.IBaseService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    private EtudiantRepository etudiantRepository;
    
    public Etudiant create(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public Etudiant update(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
    
    public List<Etudiant> createAll(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }
    
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> findById(Long id) {
        return etudiantRepository.findById(id);
    }
    
    public void delete(Etudiant etudiant) {
        etudiantRepository.delete(etudiant);
    }
    
    public void deleteById(Long id) {
        etudiantRepository.deleteById(id);
    }
    
    public void deleteAll() {
        etudiantRepository.deleteAll();
    }
}
