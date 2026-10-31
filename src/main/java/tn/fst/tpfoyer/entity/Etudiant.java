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
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant;

    String nomEt;

    String prenomEt;

    Long cin;

    String ecole;

    Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    @ToString.Exclude
    Set<Reservation> reservations = new HashSet<>();
}