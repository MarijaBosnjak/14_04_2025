package EvidencijaPolaznika;

import java.util.ArrayList;
import java.util.Scanner;

/*
Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu.
        * Omogući korisniku unos novih polaznika (ime, prezime, e-mail).
        * Omogući ispis svih polaznika na tečaju.
        * Omogući pretraživanje polaznika po e-mail adresi.
Za rješavanje koristite klasu ArrayList*/
public class EvidencijaPolaznika {
    public static void main(String[] args) {
        ArrayList<Polaznik1> dodajemPolaznike = new ArrayList<>();
        dodajemPolaznike.add(new Polaznik1("Ana", "Anić", "Anaanic@gmail.com"));
        dodajemPolaznike.add(new Polaznik1("Pero", "Perić", "PeroPeric@gmail.com"));
        dodajemPolaznike.add(new Polaznik1("Juro ", "Juric", "Jurojuric@gmail.com"));
        for (Polaznik1 polaznik : dodajemPolaznike) {
            System.out.println("Polaznici u listi su: " + polaznik);
        }
        //dodavanje novih polaznika
        Scanner sc = new Scanner(System.in);
        String dodajPolaznike;
        do {
            System.out.println("Unesi ime polaznika: ");
            String ime = sc.nextLine();
            System.out.println("Unesi prezime polaznika");
            String prezime = sc.nextLine();
            System.out.println("Unesi email polaznika");
            String email = sc.nextLine();
            dodajemPolaznike.add(new Polaznik1(ime, prezime, email));
            System.out.print("Želite li dodati još jednog polaznika?(da/ne):");
            dodajPolaznike = sc.nextLine().trim().toLowerCase();
        } while (dodajPolaznike.equals("da"));
        System.out.println("Polaznici u evidenciji:");
        for (Polaznik1 polaznik : dodajemPolaznike) {
            System.out.println(polaznik);

        }
        // sc.close();
        //Pretrazivanje po Email-u.
        System.out.println("Unesite trazeni email za pretrazivanje:");
        String trazeniEmail = sc.nextLine().trim().toLowerCase();
        boolean pronaden = false;
        for (Polaznik1 polaznik : dodajemPolaznike) {
            if (polaznik.getEmail().toLowerCase().equals(trazeniEmail)) {
                System.out.println("Polaznik pronaden: " + polaznik);
                pronaden = true;
                break;

            }
            if (!pronaden){
                System.out.println("Nema polaznika sa tom adresom");
            }

        }
    }


}

