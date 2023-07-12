public class Slitherin extends Hogwarts {
    private int tricky;
    private int initiative;
    private int ambition;
    private int wantsPower;
    private int smart;

    public Slitherin(String name, String surname, int magic, int transfiguration, int tricky, int initiative,
                     int ambition, int wantsPower, int smart) {
        super(name, surname, magic, transfiguration);
        this.tricky = tricky;
        this.initiative = initiative;
        this.ambition = ambition;
        this.wantsPower = wantsPower;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Slitherin{" +
                super.toString() +
                "tricky=" + tricky +
                ", initiative=" + initiative +
                ", ambition=" + ambition +
                ", wantsPower=" + wantsPower +
                ", smart=" + smart +
                '}';
    }

    public void comareTo(Slitherin other) {
        int thisCount = this.tricky + this.initiative + this.ambition + this.wantsPower + this.smart;
        int otherCount = other.tricky + other.initiative + other.ambition + other.wantsPower + other.smart;

        if (thisCount > otherCount) {
            printComparingResult(this, other);
        } else if (thisCount < otherCount) {
            printComparingResult(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }

    private void printComparingResult(Slitherin bestStudent, Slitherin worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший Слизеринец чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
