import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Polaznik> listaPolaznika = new ArrayList<>();
        //Dodavanje polaznika u listu
        listaPolaznika.add(new Polaznik("Ana"));
        listaPolaznika.add(new Polaznik("Marko"));
        //Prikazivanje polaznika u listi
        for (Polaznik polaznik : listaPolaznika) {
            System.out.println("Polaznik" + polaznik.getIme());
        }
    }
}