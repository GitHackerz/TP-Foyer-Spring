package tn.esprit.tpfoyer.service.foyer;

import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IBaseService;

import java.util.List;

public interface IFoyerService extends IBaseService<Foyer, Long> {
    List<Foyer> findByBlocsId(Long blocId);

    Foyer findByIdFoyerAndBlocsIdBloc(Long idFoyer, Long blocId);

    List<Foyer> findByBlocsCapaciteBloc(Long capaciteBloc);

    Foyer findByBlocsIdBlocAndUniversiteIdUniversite(Long blocId, Long universiteId);

}
