package pl.wat.bibliotekaAI.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ksiazka implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_ksiazki;
    @Size(min = 13, max = 13)
    //@NotNull
    private String ISBN;
    //@NotNull
    private String autor;
    //@NotNull
    private String tytul;
   // @NotNull
    private String wydawnictwo;
   // @NotNull
    private int ilosc_stron;
    //@NotNull
    private int rok_wydania;
    //@NotNull
    private String kategoria;
   // @NotNull
    private String status_ksiazki;
//    @OneToMany
//    public List<Zamowienie> zam = new ArrayList<>();

    public Ksiazka(){};


    public Ksiazka(String ISBN, String autor,
                   String tytul, String wydawnictwo, int ilosc_stron,
                   int rok_wydania, String kategoria, String status_ksiazki) {

        this.ISBN = ISBN;
        this.autor = autor;
        this.tytul = tytul;
        this.wydawnictwo = wydawnictwo;
        this.ilosc_stron = ilosc_stron;
        this.rok_wydania = rok_wydania;
        this.kategoria = kategoria;
        this.status_ksiazki = status_ksiazki;
    }

    public int getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(int id_ksiazki) {
        this.id_ksiazki = id_ksiazki;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getIlosc_stron() {
        return ilosc_stron;
    }

    public void setIlosc_stron(int ilosc_stron) {
        this.ilosc_stron = ilosc_stron;
    }

    public int getRok_wydania() {
        return rok_wydania;
    }

    public void setRok_wydania(int rok_wydania) {
        this.rok_wydania = rok_wydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "id_ksiazki=" + id_ksiazki +
                ", ISBN='" + ISBN + '\'' +
                ", autor='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", ilosc_stron=" + ilosc_stron +
                ", rok_wydania=" + rok_wydania +
                ", kategoria='" + kategoria + '\'' +
                ", status_ksiazki='" + status_ksiazki + '\'' +
                //", zam=" + zam +
                '}';
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getStatus_ksiazki() {
        return status_ksiazki;
    }

    public void setStatus_ksiazki(String status_ksiazki) {
        this.status_ksiazki = status_ksiazki;
    }
}
