package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    List<Foyer> findByBlocsId(Long blocId);
    Foyer findByIdFoyerAndBlocsIdBloc(Long idFoyer, Long blocId);
    List<Foyer> findByBlocsCapaciteBloc(Long capaciteBloc);
    Foyer findByBlocsIdBlocAndUniversiteIdUniversite(Long blocId, Long universiteId);
}
