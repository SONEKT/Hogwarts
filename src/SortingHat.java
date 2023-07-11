import java.util.Random;

public class SortingHat {

    public static int random() {
        return (int) (Math.random() * (100 + 1));
    }

    public static void main(String[] args) {
        Gryffindor hary = new Gryffindor("Harry", "Potter", random(), random(), random(), random(),
                random());
        Gryffindor ron = new Gryffindor("Ron", "Yisley", random(), random(), random(), random(),
                random());
        Gryffindor hermiona = new Gryffindor("Hermiona", "Greingher", random(), random(), random(),
                random(), random());
        Hufflepuff zaharia = new Hufflepuff("Zaharia", "Smith", random(), random(), random(),
                random(), random());
        Hufflepuff sedrik = new Hufflepuff("Sedrik", "Digory", random(), random(), random(),
                random(), random());
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchil", random(), random(),
                random(), random(), random());
        Kogtewran jhou = new Kogtewran("Jow", "Chang", random(), random(), random(), random(), random(),
                random());
        Kogtewran padan = new Kogtewran("Padam", "Patil", random(), random(), random(), random(),
                random(), random());
        Kogtewran markus = new Kogtewran("Markus", "Beily", random(), random(), random(), random(),
                random(), random());
        Slitherin drako = new Slitherin("Drako", "Malfoy", random(), random(), random(), random(),
                random(), random(), random());
        Slitherin greham = new Slitherin("Greham", "Montegru", random(), random(), random(), random(),
                random(), random(), random());
        Slitherin gregori = new Slitherin("Gregori", "Goil", random(), random(), random(), random(),
                random(), random(), random());
    }
}