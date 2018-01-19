package pl.wat.bibliotekaAI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.bibliotekaAI.model.Zamowienie;
@Repository
public interface ZamowienieDAO extends CrudRepository<Zamowienie, Long> {
}
