package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.time.LocalDate;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    List<Etudiant> findByNomEtudiant(String nom);
    List<Etudiant> findByPrenomEtudiant(String prenom);
    List<Etudiant> findByNomEtudiantAndPrenomEtudiant(String nom, String prenom);
    List<Etudiant> findByNomEtudiantOrPrenomEtudiant(String nom, String prenom);
    List<Etudiant> findByIdEtudiantGreaterThan(Long minId);
    List<Etudiant> findByIdEtudiantLessThan(Long maxId);
    List<Etudiant> findByDateNaissanceAfter(LocalDate date);
    List<Etudiant> findByEcole(String ecole);
    List<Etudiant> findByReservationsIdReservation(String reservationId);
    List<Etudiant> findByReservationsAnneUniversitaire(LocalDate anneUniversitaire);
    List<Etudiant> findByEcoleAndDateNaissanceAfter(String ecole, LocalDate date);
    List<Etudiant> findByReservationsAnneUniversitaireOrderByDateNaissance(LocalDate anneUniversitaire);

    @Modifying
    @Query("DELETE FROM Etudiant e WHERE e.idEtudiant > ?1")
    Etudiant removeEtudiantByIdEtudiantGreaterThan(Long minId);

}
