package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {

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

    @Query("SELECT b FROM Bloc b WHERE b.foyer.idFoyer = ?1")
    List<Bloc> findByFoyerIdFoyerJPQL(Long idFoyer);

    @Query(value = "SELECT * FROM Bloc b WHERE b.foyer.idFoyer = ?1", nativeQuery = true)
    List<Bloc> findByFoyerIdFoyerSQL(Long idFoyer);

    @Query("SELECT b FROM Bloc b WHERE b.foyer.universite.idUniversite = ?1")
    List<Bloc> findByFoyerUniversiteIdUniversiteJPQL(Long universiteId);

    @Query(value = "SELECT * FROM Bloc b WHERE b.foyer.universite.idUniversite = ?1", nativeQuery = true)
    List<Bloc> findByFoyerUniversiteIdUniversiteSQL(Long universiteId);

    @Query("SELECT f from Foyer f JOIN Bloc b ON f.idFoyer = b.foyer.idFoyer WHERE b.idBloc = ?1")
    Bloc findFoyerByBlocIdJPQL(Long idBloc);

    @Query(value = "SELECT f.* from Foyer f JOIN Bloc b ON f.idFoyer = b.foyer_id_foyer WHERE b.id_bloc = ?1", nativeQuery = true)
    Bloc findFoyerByBlocIdSQL(Long idBloc);


    @Modifying
    @Query("UPDATE Etudiant e SET e.ecole=?1 WHERE e.idEtudiant < ?2")
    void updateNomUniversiteJPQL(String nomEcole, Long idEtudiant);

    @Modifying
    @Query(value = "UPDATE Etudiant SET ecole=?1 WHERE idEtudiant < ?2", nativeQuery = true)
    void updateNomUniversiteSQL(String nomEcole, Long idEtudiant);


 }
