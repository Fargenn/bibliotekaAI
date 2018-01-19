package wat.biblioteka.dao;

import org.springframework.beans.factory.annotation.Autowired;
import wat.biblioteka.model.Ksiazka;
import wat.biblioteka.model.Uzytkownik;
import wat.biblioteka.model.Zamowienie;

import java.util.ArrayList;
import java.util.List;

public class KsiazkaDaoImpl {
    @Autowired
    private KsiazkaDao ksiazka;

    public List<Ksiazka> wyswietlWszystkie()
    {
        return ksiazka.findAll();
    }

    public List<Ksiazka> znajdzPoTytule(String tytul)
    {
//        List<Ksiazka> ksiazki = new ArrayList<>();
//        Ksiazka ks = new Ksiazka();
//        for(Long i = 1L ; i<(Long) ksiazka.count()+1; i++)
//        {
//            ks = ksiazka.findOne(i);
//            if(ks.getTytul() == tytul)
//            {
//                ksiazki.add(ks);
//            }
//        }
//
//       return ksiazki;
        return null;

    }

    public void dodaj(Ksiazka ks)
    {
        ksiazka.save(ks);
    }

    public void usun(Ksiazka ks)
    {
        ksiazka.delete(ksiazka.findOne(ks.getId_ksiazki()));
    }


}
