package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tpfoyer.Enums.TypeChambre;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    @Column(unique = true)
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @OneToMany
    List<Reservation> reservations;

    @ManyToOne
    @JoinColumn
    Bloc bloc;
}
