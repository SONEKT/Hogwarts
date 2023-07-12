public abstract class Hogwarts {
    private String name;

    private String surname;

    private int magic;

    private int transfiguration;

    public Hogwarts(String name, String surname, int magic, int transfiguration) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transfiguration = transfiguration;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", transfiguration=" + transfiguration;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void comareTo(Hogwarts other) {
        int thisCount = this.magic + this.transfiguration;
        int otherCount = other.magic + other.transfiguration;

        if (thisCount > otherCount) {
            printComparingResult(this, other);
        } else if (thisCount < otherCount) {
            printComparingResult(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }
    private void printComparingResult(Hogwarts bestStudent, Hogwarts worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший ученик чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
