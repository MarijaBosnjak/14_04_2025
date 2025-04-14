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
        ArrayList<Polaznik> dodajemPolaznike = new ArrayList<>();
        dodajemPolaznike.add(new Polaznik("Ana", "Anić", "Anaanic@gmail.com"));
        dodajemPolaznike.add(new Polaznik("Pero", "Perić", "PeroPeric@gmail.com"));
        dodajemPolaznike.add(new Polaznik("Juro ", "Juric", "Jurojuric@gmail.com"));
        for (Polaznik polaznik : dodajemPolaznike) {
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
            dodajemPolaznike.add(new Polaznik(ime, prezime, email));
            System.out.print("Želite li dodati još jednog polaznika?(da/ne):");
            dodajPolaznike = sc.nextLine().trim().toLowerCase();
        } while (dodajPolaznike.equals("da"));
        System.out.println("Polaznici u evidenciji:");
        for (Polaznik polaznik : dodajemPolaznike) {
            System.out.println(polaznik);

        }
        // sc.close();
        //Pretrazivanje po Email-u.
        System.out.println("Unesite trazeni email za pretrazivanje:");
        String trazeniEmail = sc.nextLine().trim().toLowerCase();
        boolean pronaden = false;
        for (Polaznik polaznik : dodajemPolaznike) {
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

