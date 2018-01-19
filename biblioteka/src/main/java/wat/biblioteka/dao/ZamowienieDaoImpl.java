package wat.biblioteka.dao;

import org.springframework.beans.factory.annotation.Autowired;
import wat.biblioteka.model.Ksiazka;
import wat.biblioteka.model.Uzytkownik;
import wat.biblioteka.model.Zamowienie;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ZamowienieDaoImpl {


    @Autowired
    private ZamowienieDao zam;

    public Zamowienie zarezerwujKsiazke(Uzytkownik us, Ksiazka ks)
    {
        Date date = new Date();
        Zamowienie zamowienie = new Zamowienie(date, us, ks);
        us.zam.add(zamowienie);
        ks.zam.add(zamowienie);
        //save(zamowienie.user);



        return null;
    }

    public Zamowienie wypozyczKsiazke(Zamowienie zamowienie)
    {
        return null;

    }

    public Zamowienie przedluzTermin(Zamowienie zamowienie)
    {
        return null;

    }

    public Zamowienie zwrocKsiazke(Zamowienie zamowienie)
    {
        return null;

    }


}
