package wat.biblioteka.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_uzytkownika;
  //  @NotNull
    private String login;
   // @NotNull
    private String haslo;
   // @NotNull
    private String imie;
   // @NotNull
    private String nazwisko;
   // @NotNull
    private String adres;
   // @NotNull
    private String miasto;
   // @NotNull
    private String wojewodztwo;
    //@NotNull
    private String kod_pocztowy;
   // @NotNull
    @Size(min=9,max=9)
    private String telefon;
   // @NotNull
    private String email;
   // @NotNull
    private String typ_uzytkownika;
    @OneToMany
    public List<Zamowienie> zam = new ArrayList<>();


    public Uzytkownik( String login, String haslo,
                      String imie, String nazwisko, String adres, String miasto,
                      String wojewodztwo, String kod_pocztowy, String telefon,
                      String email, String typ_uzytkownika) {
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.miasto = miasto;
        this.wojewodztwo = wojewodztwo;
        this.kod_pocztowy = kod_pocztowy;
        this.telefon = telefon;
        this.email = email;
        this.typ_uzytkownika = typ_uzytkownika;
    }

    @Override
    public String toString() {
        return "Uzytkownik{" +
                "id_uzytkownika=" + id_uzytkownika +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres='" + adres + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wojewodztwo='" + wojewodztwo + '\'' +
                ", kod_pocztowy='" + kod_pocztowy + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Long getId_uzytkownika() {
        return id_uzytkownika;
    }

    public void setId_uzytkownika(Long id_uzytkownika) {
        this.id_uzytkownika = id_uzytkownika;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
