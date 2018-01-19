package pl.wat.bibliotekaAI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.wat.bibliotekaAI.Service.KsiazkaService;
import pl.wat.bibliotekaAI.model.Ksiazka;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    private KsiazkaService ks;
    @RequestMapping("/")
    @ResponseBody
    public String hello(HttpServletRequest request)
    {
        request.setAttribute("mode", "MODE_HOME");
        return "index";
    }
    @RequestMapping("/allksiazka")
    public String allKsiazki(HttpServletRequest request)
    {
        request.setAttribute("ksiazki", ks.findAll());
        request.setAttribute("mode", "MODE_KSIAZKI");
        return "index";
    }

    @RequestMapping("/newksiazka")
    public String newKsiazki(HttpServletRequest request)
    {
        request.setAttribute("mode", "MODE_NEW");
        return "index";
    }

    @RequestMapping("/saveksiazka")
    public String saveKsiazki(@ModelAttribute Ksiazka k, HttpServletRequest request)
    {
        ks.dodaj(k);
        request.setAttribute("ksiazka", ks.findAll());
        request.setAttribute("mode", "MODE_UPDATE");
        return "index";
    }

    @RequestMapping("/updateksiazka")
    public String updateKsiazki(@RequestParam int id, HttpServletRequest request)
    {
        request.setAttribute("ksiazka", ks.findKsiazka(id));
        request.setAttribute("mode", "MODE_UPDATE");
        return "index";
    }

    @RequestMapping("/deleteksiazka")
    public String deleteKsiazki(@RequestParam int id, HttpServletRequest request)
    {
        ks.usun(id);
        request.setAttribute("ksiazka", ks.findKsiazka(id));
        request.setAttribute("mode", "MODE_UPDATE");
        return "index";
    }



}
