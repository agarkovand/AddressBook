package pl.com.britenet.agarkov.addressbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Email {

    @Id
    private String eMail;

    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    private Person person;
}
