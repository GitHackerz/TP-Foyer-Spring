package tn.esprit.tpfoyer.service.etudiant;

import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.service.IBaseService;

import java.time.LocalDate;
import java.util.List;

public interface IEtudiantService extends IBaseService<Etudiant, Long> {
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

}


