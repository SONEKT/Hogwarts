public class Kogtewran extends Hogwarts {
    private int shy;
    private int mind;
    private int funny;
    private int creative;

    public Kogtewran(String name, String surname, int magic, int transfiguration, int shy, int mind,
                     int funny, int creative) {
        super(name, surname, magic, transfiguration);
        this.shy = shy;
        this.mind = mind;
        this.funny = funny;
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Kogtewran{" +
                "shy=" + shy +
                ", mind=" + mind +
                ", funny=" + funny +
                ", creative=" + creative +
                '}';
    }

    public void comareTo(Kogtewran other) {
        int thisCount = this.shy + this.mind + this.funny+ this.creative;
        int otherCount = this.shy + this.mind + this.funny+ this.creative;

        if (thisCount > otherCount) {
            printComparingResult(this, other);
        } else if (thisCount > otherCount) {
            printComparingResult(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }
    private void printComparingResult(Kogtewran bestStudent, Kogtewran worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший Когтевранец чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
