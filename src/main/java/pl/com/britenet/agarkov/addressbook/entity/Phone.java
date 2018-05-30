package pl.com.britenet.agarkov.addressbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Phone {

    @Id
    private String phone;

    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    private Person person;
}
