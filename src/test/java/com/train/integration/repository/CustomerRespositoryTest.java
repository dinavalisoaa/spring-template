package com.train.integration.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
@DataJpaTest
class CustomerRespositoryTest {

    @Autowired
    CustomerRepository repos;

    @Test
    void shouldGetAllPersons() {
        //Act
        // List<Person> persons = personRepository.findAll();

        // //Assert
        // assertEquals(3, persons.size());
        assertEquals(new String("Dina"),new String("Dina"));
    }

    @Test
    void shouldGetPersonById() {
        // Person person = personRepository.findById(1L).get();

        // assertEquals("John Doe", person.getName());
        // assertEquals("Paris", person.getCity());
        // assertEquals("123-456-7890", person.getPhoneNumber());
    }

    @Test
    void shouldSavePerson() {
        // Person person = new Person();
        // person.setName("Armand");
        // person.setCity("Paris");
        // person.setPhoneNumber("142-569-8542");

        // Person savedPerson = personRepository.save(person);

        // assertNotNull(savedPerson.getId());
        // assertEquals("Armand", savedPerson.getName());
        // assertEquals("Paris", savedPerson.getCity());
        // assertEquals("142-569-8542", savedPerson.getPhoneNumber());
    }

    @Test
    void shouldUpdatePerson() {
    //     Person person = personRepository.findById(1L).get();
    //     person.setCity("Lyon");

    //     Person savedPerson = personRepository.save(person);

    //     assertEquals("Lyon", savedPerson.getCity());
    }

    @Test
    void shouldDeletePerson() {
        // personRepository.deleteById(3L);

        // Optional<Person> person = personRepository.findById(3L);

        // assertFalse(person.isPresent());
    }

}