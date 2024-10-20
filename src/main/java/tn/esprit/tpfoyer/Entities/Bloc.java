package tn.esprit.tpfoyer.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;

    private Long capaciteBloc;

    @ManyToOne
    @JoinColumn
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambres;
}
