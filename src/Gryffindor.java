public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String firstName, String lastName, int powerMagic, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery;
    }

    public void printStudent() {
        System.out.println(getFirstName() + " " + getLastName() + ", уровень магической силы " + getPowerMagic() +
                ", дистанция трансгрессии " + getDistanceOfTransgression()+ ", благородство " + getNobility()
                + ", честь " + getHonor() + ", храбрость " + getBravery());
    }

    public static void bestGryffindor (Gryffindor gryffindorOne, Gryffindor gryffindorTwo) {
        int sumGryffindorOne = gryffindorOne.getNobility() + gryffindorOne.getHonor() + gryffindorOne.getBravery();
        int sumGryffindorTwo = gryffindorTwo.getNobility() + gryffindorTwo.getHonor() + gryffindorTwo.getBravery();
        if (sumGryffindorOne > sumGryffindorTwo) {
            System.out.println(gryffindorOne.getFirstName() + " лучше Гриффендорец, чем " + gryffindorTwo.getFirstName());
        } else if (sumGryffindorOne < sumGryffindorTwo) {
            System.out.println(gryffindorTwo.getFirstName() + " лучше Гриффендорец, чем " + gryffindorOne.getFirstName());
        } else {
            System.out.println("У учеников одинаковые баллы");
        }
    }
}
