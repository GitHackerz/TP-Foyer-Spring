package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.Entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
