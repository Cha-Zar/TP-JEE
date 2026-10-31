package tn.fst.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBloc;

    String nomBloc;

    Long capaciteBloc;

    @ManyToOne
    @ToString.Exclude
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    @ToString.Exclude
    Set<Chambre> chambres = new HashSet<>();
}