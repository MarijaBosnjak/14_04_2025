package EvidencijaPolaznika16_04_2025;
/*Napiši program za evidenciju polaznika na tečaju koji također provjerava i sprječava dodavanje duplikata
 polaznika na tečaj.
Program treba omogućiti unos polaznika i njihovih podataka te provjeriti jesu li polaznici jedinstveni na tečaju.

Koristi klasu Polaznik s atributima: ime, prezime i e-mail
Koristi klasu HashSet<Polaznik> za pohranu polaznika kako bi se osigurala jedinstvenost
Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu
Omogući korisniku unos novih polaznika (ime, prezime, e-mail)
Pri dodavanju novog polaznika, provjeri je li polaznik već prisutan na tečaju (usporedba po e-mail adresi)
Ispisuj odgovarajuće poruke o uspješnom ili neuspješnom dodavanju polaznika na tečaj
Omogući ispis svih polaznika na tečaju nakon unosa
koristiti metode equals i HashCode



Što bi trebalo izmijeniti u rješenju ako dodamo novi zahtjev?
Svi polaznici moraju biti cijelo vrijeme sortirani po prezimenu uzlazno
Iskorisitit TreeSet() i sučelje Comparable*/


public class Polaznik {
    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polaznik polaznik = (Polaznik) o;
        return email.equalsIgnoreCase(polaznik.email);
    }

    @Override
    public int hashCode() {
        return email.toLowerCase().hashCode();
    }
}
