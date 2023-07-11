public class Gryffindor extends Hogwarts {

    private int nobility;

    private int honor;

    private int bravery;

    public Gryffindor(String name, String surname, int magic, int transfiguration, int nobility, int honor,
                      int bravery) {
        super(name, surname, magic, transfiguration);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void comareTo(Gryffindor other) {
        int thisCount = this.bravery + this.honor + this.nobility;
        int otherCount = this.bravery + this.honor + this.nobility;

        if (thisCount > otherCount) {
            printComparingResult(this, other);
        } else if (thisCount > otherCount) {
            printComparingResult(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }

    private void printComparingResult(Gryffindor bestStudent, Gryffindor worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший Гриффендорец чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
