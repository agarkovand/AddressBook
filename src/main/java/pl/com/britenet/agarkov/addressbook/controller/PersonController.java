package pl.com.britenet.agarkov.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pl.com.britenet.agarkov.addressbook.entity.Person;
import pl.com.britenet.agarkov.addressbook.repository.PersonRepository;

import javax.ws.rs.Produces;
import java.time.LocalDate;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public Page<Person> findAllPersons(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    @GetMapping("/persons/{firstName}")
    @Produces("application/json")
    public Page<Person> findPersonsByFirstName(@PathVariable(value = "firstName") String firstName,
                                               Pageable pageable) {
        return personRepository.findAllByFirstName(firstName, pageable);
    }


}
