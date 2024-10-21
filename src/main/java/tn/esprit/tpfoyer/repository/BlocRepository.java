package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
