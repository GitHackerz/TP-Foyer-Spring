package tn.esprit.tpfoyer.service.bloc;

import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.IBaseService;

import java.util.List;

public interface IBlocService extends IBaseService<Bloc, Long> {
    List<Bloc> findByNomBloc(String nomBloc);
    List<Bloc> findByCapaciteBloc(Long capaciteBloc);
    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, Long capaciteBloc);
    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);
    List<Bloc> findByCapaciteBlocGreaterThan(Long minCap);
    List<Bloc> findByNomBlocContains(String nom);
    List<Bloc> findByOrderByNomBlocAsc();
    List<Bloc> findByNomBlocOrCapaciteBloc(String nom, Long capacite);
    List<Bloc> findByFoyerIdFoyer(Long idFoyer);
    List<Bloc> findByFoyerUniversiteIdUniversite(Long universiteId);

}
