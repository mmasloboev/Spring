package ru.masloboev.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.masloboev.springcourse.models.Item;
import ru.masloboev.springcourse.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
     List<Item> findByItemName(String itemName);

     List<Item> findByOwner(Person person);
}
