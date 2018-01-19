package wat.biblioteka.collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wat.biblioteka.dao.KsiazkaDao;
import wat.biblioteka.dao.KsiazkaDaoImpl;
import wat.biblioteka.dao.UzytkownikDao;
import wat.biblioteka.dao.UzytkownikDaoImpl;
import wat.biblioteka.model.Ksiazka;
import wat.biblioteka.model.Uzytkownik;

import java.util.List;

@Controller
public class HomeController {

   @Autowired
    private KsiazkaDaoImpl ksiazka = new KsiazkaDaoImpl();
   @Autowired
    private UzytkownikDaoImpl user = new UzytkownikDaoImpl();



    @RequestMapping("/")
    @ResponseBody
    public String HomeMessage()
    {
//        user.dodaj(new Uzytkownik("cus", "cus", "cus", "cus", "cus", "cus", "cus", "cus", "cuscuscus", "cus", "cus"));
//        return user.wyswietlWszystkich();


        return "Tutaj powinna być strona główna";
    }



}
