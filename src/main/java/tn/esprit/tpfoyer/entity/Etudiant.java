package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
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
