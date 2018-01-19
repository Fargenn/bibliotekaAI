package wat.biblioteka.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ksiazka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ksiazki;
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
    private Year rok_wydania;
    //@NotNull
    private String kategoria;
   // @NotNull
    private String status_ksiazki;
    @OneToMany
    public List<Zamowienie> zam = new ArrayList<>();


    public Ksiazka(String ISBN, String autor,
                   String tytul, String wydawnictwo, int ilosc_stron,
                   Year rok_wydania, String kategoria, String status_ksiazki) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.tytul = tytul;
        this.wydawnictwo = wydawnictwo;
        this.ilosc_stron = ilosc_stron;
        this.rok_wydania = rok_wydania;
        this.kategoria = kategoria;
        this.status_ksiazki = status_ksiazki;
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
                '}';
    }

    public Long getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(Long id_ksiazki) {
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

    public Year getRok_wydania() {
        return rok_wydania;
    }

    public void setRok_wydania(Year rok_wydania) {
        this.rok_wydania = rok_wydania;
    }
}
