package pl.com.britenet.agarkov.addressbook.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Phone {

    @Id
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="person_id", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Person person;
}
