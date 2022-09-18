package repository;


import entity.Person;
import entity.PrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PrimaryKey> {
    List<Person> findByCity(String city);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
