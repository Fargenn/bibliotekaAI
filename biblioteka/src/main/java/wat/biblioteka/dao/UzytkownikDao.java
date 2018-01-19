package wat.biblioteka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wat.biblioteka.model.Uzytkownik;

import java.util.List;
@Repository
public interface UzytkownikDao extends JpaRepository<Uzytkownik, Long>{

}
