package pl.wat.bibliotekaAI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.bibliotekaAI.Service.KsiazkaService;
import pl.wat.bibliotekaAI.model.Ksiazka;

@RestController
public class HomeController {
    @Autowired
    private KsiazkaService kS;

    @RequestMapping("/home")
    @ResponseBody
    public String hello()
    {
        return "Tu powinna byc strona glowna.";
    }

//    @RequestMapping("/allksiazka")
//    public String allKsiazka()
//    {
//        return kS.findAll().toString();
//    }
//
//    @RequestMapping("/saveksiazka")
//    public String saveKsiazka(@RequestParam String autor) {
//
//        Ksiazka ks = new Ksiazka("2222222222222", autor,
//                "Cusie 2", "Fabryka slow", 250,
//                1998, "dostepna", "fantasy");
//        kS.dodaj(ks);
//        return "Ksiazka zapisana!";
//    }
//
//    @RequestMapping("/deleteksiazka")
//    public String deleteKsiazka(@RequestParam int id) {
//
//        kS.usun(id);
//        return "Ksiazka usunieta!";
//    }


}
