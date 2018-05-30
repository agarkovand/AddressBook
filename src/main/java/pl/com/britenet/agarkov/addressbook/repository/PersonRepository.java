package pl.com.britenet.agarkov.addressbook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import pl.com.britenet.agarkov.addressbook.entity.Person;

import java.time.LocalDate;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Page<Person> findAll(Pageable pageable);
    Page<Person> findAllByFirstName(String firstName, Pageable pageable);
}
