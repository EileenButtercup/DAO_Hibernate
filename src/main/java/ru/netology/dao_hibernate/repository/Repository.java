package ru.netology.dao_hibernate.repository;

import ru.netology.dao_hibernate.entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery("SELECT p FROM Person p WHERE p.city_of_living = :city")
                .setParameter("city",city).getResultList();
    }
}