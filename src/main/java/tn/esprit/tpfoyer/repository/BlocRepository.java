package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {

    List<Bloc> findByNomBloc(String nomBLoc);
    List<Bloc> findByCapaciteBloc(Long capaciteBloc);
    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, Long capaciteBloc);
    List<Bloc> findByNomBlocIgnoreCase(String nomBLoc);
    List<Bloc> findByCapaciteBlocGreaterThan(Long minCap);
    List<Bloc> findByNomBlocContains(String nom);
    List<Bloc> findByOrderByNomBlocAsc(String nom);
    List<Bloc> findByNomBlocOrCapaciteBloc(String nom, Long capacite);
    List<Bloc> findByFoyerIdFoyer(Long idFoyer);
    List<Bloc> findByFoyerUniversiteIdUniversite(Long universiteId);

 }
