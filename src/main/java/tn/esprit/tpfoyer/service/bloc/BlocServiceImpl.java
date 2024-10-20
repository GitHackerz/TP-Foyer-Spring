package tn.esprit.tpfoyer.service.bloc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Repositories.BlocRepository;
import tn.esprit.tpfoyer.service.IBaseService;

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

}
