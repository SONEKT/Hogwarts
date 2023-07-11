public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honestly;

    public Hufflepuff(String name, String surname, int magic, int transfiguration, int hardworking, int loyalty,
                      int honestly) {
        super(name, surname, magic, transfiguration);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honestly = honestly;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                ", hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honestly=" + honestly +
                '}';
    }
    public void comareTo(Hufflepuff other) {
        int thisCount = this.hardworking + this.loyalty + this.honestly;
        int otherCount = this.hardworking + this.loyalty + this.honestly;

        if (thisCount > otherCount) {
            printComparingResult(this, other);
        } else if (thisCount > otherCount) {
            printComparingResult(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }
    private void printComparingResult(Hufflepuff bestStudent, Hufflepuff worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший Пуффендуец чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
