package pl.wat.bibliotekaAI.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "ZAMOWIENIE")
public class Zamowienie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_zamowienia;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date  data_zamowienia;
    @Temporal(TemporalType.DATE)
    private Date data_odbioru;
    @Temporal(TemporalType.DATE)
    private Date termin_zwrotu;
    @Temporal(TemporalType.DATE)
    private Date data_zwrotu;
    @ManyToOne
    public Uzytkownik user;
    @ManyToOne
    private Ksiazka ksiazka;


    public Zamowienie(Date data_zamowienia, Uzytkownik user, Ksiazka ksiazka) {
        this.data_zamowienia = data_zamowienia;
        this.user = user;
        this.ksiazka = ksiazka;
    }


    @Override
    public String toString() {
        return "Zamowienie{" +
                "id_zamowienia=" + id_zamowienia +
                ", data_zamowienia=" + data_zamowienia +
                ", data_odbioru=" + data_odbioru +
                ", termin_zwrotu=" + termin_zwrotu +
                ", data_zwrotu=" + data_zwrotu +
                '}';
    }

    public int getId_zamowienia() {
        return id_zamowienia;
    }

    public void setId_zamowienia(int id_zamowienia) {
        this.id_zamowienia = id_zamowienia;
    }

    public Date getData_zamowienia() {
        return data_zamowienia;
    }

    public void setData_zamowienia(Date data_zamowienia) {
        this.data_zamowienia = data_zamowienia;
    }

    public Date getData_odbioru() {
        return data_odbioru;
    }

    public void setData_odbioru(Date data_odbioru) {
        this.data_odbioru = data_odbioru;
    }

    public Date getTermin_zwrotu() {
        return termin_zwrotu;
    }

    public void setTermin_zwrotu(Date termin_zwrotu) {
        this.termin_zwrotu = termin_zwrotu;
    }

    public Date getData_zwrotu() {
        return data_zwrotu;
    }

    public void setData_zwrotu(Date data_zwrotu) {
        this.data_zwrotu = data_zwrotu;
    }


}
