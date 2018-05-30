package pl.com.britenet.agarkov.addressbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String firstName;
    private String lastName;
    private char gender;

    @Column(columnDefinition = "DATE")
    private LocalDate birthday;
    private String pesel;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "person")
    private Set<Phone> phones = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "person")
    private Set<Email> emails = new HashSet<>();

}