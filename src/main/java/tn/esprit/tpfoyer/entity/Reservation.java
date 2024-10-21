package tn.esprit.tpfoyer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Reservation {

    @Id
    private String idReservation;
    private LocalDate anneUniversitaire;
    private Boolean estValide;

    @ManyToMany
    List<Etudiant> etudiantList;
}
