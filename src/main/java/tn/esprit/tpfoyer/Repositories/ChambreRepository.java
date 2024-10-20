package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.Entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
