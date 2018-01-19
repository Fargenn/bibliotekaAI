package wat.biblioteka.dao;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import wat.biblioteka.model.Ksiazka;

@Repository
public interface KsiazkaDao extends JpaRepository<Ksiazka, Long> {


}