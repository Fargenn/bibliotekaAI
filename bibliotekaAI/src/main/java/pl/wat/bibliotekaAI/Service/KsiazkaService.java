package pl.wat.bibliotekaAI.Service;

import org.springframework.stereotype.Service;
import pl.wat.bibliotekaAI.dao.KsiazkaDAO;
import pl.wat.bibliotekaAI.model.Ksiazka;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class KsiazkaService {

    private final KsiazkaDAO zD;

    public KsiazkaService(KsiazkaDAO zD) {
        this.zD = zD;
    }

    public List<Ksiazka> findAll()
    {
        List<Ksiazka> ksiazki = new ArrayList<>();
        for(Ksiazka k : zD.findAll())
        {
            ksiazki.add(k);
        }

        return ksiazki;
    }

    public void dodaj(Ksiazka ks)
    {
        zD.save(ks);
    }

    public Ksiazka findKsiazka(int id)
    {
        return zD.findOne(id);
    }

    public void usun(int id)
    {
        zD.delete(zD.findOne(id));
    }
}
