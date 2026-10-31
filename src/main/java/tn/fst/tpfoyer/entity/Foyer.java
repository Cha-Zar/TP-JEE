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
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer;

    String nomFoyer;

    Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    @ToString.Exclude
    Universite universite;

    @OneToMany(mappedBy = "foyer")
    @ToString.Exclude
    Set<Bloc> blocs = new HashSet<>();
}