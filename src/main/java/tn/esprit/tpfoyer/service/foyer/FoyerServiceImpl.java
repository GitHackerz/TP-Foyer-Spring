package tn.esprit.tpfoyer.service.foyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class FoyerServiceImpl implements IFoyerService {
    private FoyerRepository foyerRepository;


    public Foyer create(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public List<Foyer> createAll(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    public Foyer update(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    public Optional<Foyer> findById(Long id) {
        return foyerRepository.findById(id);
    }

    public void delete(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

    public void deleteById(Long id) {
        foyerRepository.deleteById(id);
    }

    public void deleteAll() {
        foyerRepository.deleteAll();
    }

    public List<Foyer> findByBlocsId(Long blocId) {
        return foyerRepository.findByBlocsIdBloc(blocId);
    }

    public Foyer findByIdFoyerAndBlocsIdBloc(Long idFoyer, Long blocId) {
        return foyerRepository.findByIdFoyerAndBlocsIdBloc(idFoyer, blocId);
    }

    public List<Foyer> findByBlocsCapaciteBloc(Long capaciteBloc) {
        return foyerRepository.findByBlocsCapaciteBloc(capaciteBloc);
    }

    public Foyer findByBlocsIdBlocAndUniversiteIdUniversite(Long blocId, Long universiteId) {
        return foyerRepository.findByBlocsIdBlocAndUniversiteIdUniversite(blocId, universiteId);
    }

}
