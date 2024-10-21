package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEtudiant;

    private String prenomEtudiant;

    private Long cin;

    private String ecole;

    private LocalDate dateNaissance;

    @ManyToMany(mappedBy = "etudiantList")
    List<Reservation> reservations ;
}
