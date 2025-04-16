package EvidencijaPolaznika16_04_2025;

//import EvidencijaPolaznika16_04_2025.Polaznik;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
     //   HashSet<Polaznik> dodajemPolaznike = new HashSet<>();
        TreeSet<Polaznik> dodajemPolaznike = new TreeSet<>();
        // Dodavanje početnih polaznika
        dodajemPolaznike.add(new Polaznik("Ana", "Anić", "Anaanic@gmail.com"));
        dodajemPolaznike.add(new Polaznik("Pero", "Perić", "PeroPeric@gmail.com"));
        dodajemPolaznike.add(new Polaznik("Juro", "Juric", "Jurojuric@gmail.com"));

        System.out.println("Početna lista polaznika:");
        for (Polaznik polaznik : dodajemPolaznike) {
            System.out.println(polaznik);
        }

        // Unos novih polaznika
        Scanner sc = new Scanner(System.in);
        String dodajPolaznike;

        do {
            System.out.println("Unesi ime polaznika:");
            String ime = sc.nextLine();
            System.out.println("Unesi prezime polaznika:");
            String prezime = sc.nextLine();
            System.out.println("Unesi email polaznika:");
            String email = sc.nextLine();

            Polaznik noviPolaznik = new Polaznik(ime, prezime, email);
            if (dodajemPolaznike.add(noviPolaznik)) {
                System.out.println("Polaznik je uspješno dodan.");
            } else {
                System.out.println("Polaznik s ovim emailom već postoji! Nije dodan.");
            }

            System.out.print("Želite li dodati još jednog polaznika? (da/ne): ");
            dodajPolaznike = sc.nextLine().trim().toLowerCase();
        } while (dodajPolaznike.equals("da"));

        // Ispis svih polaznika nakon unosa
        System.out.println("\nPolaznici u evidenciji:");
        for (Polaznik polaznik : dodajemPolaznike) {
            System.out.println(polaznik);
        }


    }
}