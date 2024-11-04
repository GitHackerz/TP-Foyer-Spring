package tn.esprit.tpfoyer.service.bloc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    private BlocRepository blocRepository;

    public Bloc create(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public List<Bloc> createAll(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    public Bloc update(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }

    public Optional<Bloc> findById(Long id) {
        return blocRepository.findById(id);
    }

    public void delete(Bloc bloc) {
        blocRepository.delete(bloc);
    }

    public void deleteById(Long id) {
        blocRepository.deleteById(id);
    }

    public void deleteAll() {
        blocRepository.deleteAll();
    }

    public List<Bloc> findByNomBloc(String nomBloc) {
        return blocRepository.findByNomBloc(nomBloc);
    }

    public List<Bloc> findByCapaciteBloc(Long capaciteBloc) {
        return blocRepository.findByCapaciteBloc(capaciteBloc);
    }

    public List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, Long capaciteBloc) {
        return blocRepository.findByNomBlocAndCapaciteBloc(nomBloc, capaciteBloc);
    }

    public List<Bloc> findByNomBlocIgnoreCase(String nomBloc) {
        return blocRepository.findByNomBlocIgnoreCase(nomBloc);
    }

    public List<Bloc> findByCapaciteBlocGreaterThan(Long minCap) {
        return blocRepository.findByCapaciteBlocGreaterThan(minCap);
    }

    public List<Bloc> findByNomBlocContains(String nom) {
        return blocRepository.findByNomBlocContains(nom);
    }

    public List<Bloc> findByOrderByNomBlocAsc() {
        return blocRepository.findByOrderByNomBlocAsc();
    }

    public List<Bloc> findByNomBlocOrCapaciteBloc(String nom, Long capacite) {
        return blocRepository.findByNomBlocOrCapaciteBloc(nom, capacite);
    }

    public List<Bloc> findByFoyerIdFoyer(Long idFoyer) {
        return blocRepository.findByFoyerIdFoyer(idFoyer);
    }

    public List<Bloc> findByFoyerUniversiteIdUniversite(Long universiteId) {
        return blocRepository.findByFoyerUniversiteIdUniversite(universiteId);
    }


}
