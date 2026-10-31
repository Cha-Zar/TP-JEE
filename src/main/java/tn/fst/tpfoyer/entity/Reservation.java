package tn.fst.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    String idReservation;

    Date anneeUniversitaire;

    boolean estValide;

    @ManyToMany
    @ToString.Exclude
    Set<Etudiant> etudiants = new HashSet<>();
}