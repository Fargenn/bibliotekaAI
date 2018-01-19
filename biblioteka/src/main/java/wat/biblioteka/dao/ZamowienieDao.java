package wat.biblioteka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import wat.biblioteka.model.Zamowienie;

public interface ZamowienieDao extends JpaRepository<Zamowienie, Long> {

}
