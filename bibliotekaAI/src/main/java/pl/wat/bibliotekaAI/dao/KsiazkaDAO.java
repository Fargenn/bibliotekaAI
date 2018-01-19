package pl.wat.bibliotekaAI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.bibliotekaAI.model.Ksiazka;
@Repository
public interface KsiazkaDAO extends CrudRepository<Ksiazka, Integer> {
}
