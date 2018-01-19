package wat.biblioteka.dao;

import org.springframework.beans.factory.annotation.Autowired;
import wat.biblioteka.model.Uzytkownik;
import java.util.List;

public class UzytkownikDaoImpl {
    @Autowired
    private UzytkownikDao user ;

    public List<Uzytkownik> wyswietlWszystkich() {

        return user.findAll();
    }


    public void dodaj(Uzytkownik us) {

        user.save(us);

    }


    public void usun(Uzytkownik us) {

        user.delete(user.findOne(us.getId_uzytkownika()));


    }
}
