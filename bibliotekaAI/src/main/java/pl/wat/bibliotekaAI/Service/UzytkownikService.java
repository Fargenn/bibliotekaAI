package pl.wat.bibliotekaAI.Service;

import org.springframework.stereotype.Service;
import pl.wat.bibliotekaAI.dao.UzytkownikDAO;
import pl.wat.bibliotekaAI.model.Ksiazka;
import pl.wat.bibliotekaAI.model.Uzytkownik;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UzytkownikService {
    private final UzytkownikDAO uD;

    public UzytkownikService(UzytkownikDAO uD) {
        this.uD = uD;
    }

    public List<Uzytkownik> findAll()
    {
        List<Uzytkownik> users = new ArrayList<>();
        for(Uzytkownik u : uD.findAll())
        {
            users.add(u);
        }

        return users;
    }

    public void dodaj(Uzytkownik u)
    {
        uD.save(u);
    }

    public void usun(int id)
    {
        uD.delete(uD.findOne(id));
    }
}
