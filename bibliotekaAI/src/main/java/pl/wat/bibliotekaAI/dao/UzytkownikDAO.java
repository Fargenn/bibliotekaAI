package pl.wat.bibliotekaAI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.bibliotekaAI.model.Uzytkownik;
@Repository
public interface UzytkownikDAO extends CrudRepository<Uzytkownik, Integer> {
}
