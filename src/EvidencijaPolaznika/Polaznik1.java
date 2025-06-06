package EvidencijaPolaznika;
/*Napiši program za evidenciju polaznika na tečaju. Program treba omogućiti unos polaznika i njihovih podataka te pružiti osnovne funkcije za upravljanje evidencijom.
Napravi klasu Polaznik koja ima sljedeće atribute:
 * Ime polaznika
* Prezime polaznika
* E-mail adresa polaznika*/

public class Polaznik1 {
    private String ime;
    private String prezime;
    private String email;

    public Polaznik1(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " (" + email + ")";
    }
}
