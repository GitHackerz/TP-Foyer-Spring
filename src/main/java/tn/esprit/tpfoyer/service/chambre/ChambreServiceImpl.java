package tn.esprit.tpfoyer.service.chambre;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private ChambreRepository chambreRepository;

    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    public Optional<Chambre> findById(Long id) {
        return chambreRepository.findById(id);
    }

    public Chambre create(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public List<Chambre> createAll(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    public Chambre update(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public void delete(Chambre chambre) {
        chambreRepository.delete(chambre);
    }

    public void deleteById(Long id) {
        chambreRepository.deleteById(id);
    }

    public void deleteAll() {
        chambreRepository.deleteAll();
    }

}
