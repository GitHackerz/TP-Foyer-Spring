package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Reservation {

    @Id
    private String idReservation;
    private LocalDate anneUniversitaire;
    private Boolean estValide;

    @ManyToMany
    List<Etudiant> etudiantList;
}
