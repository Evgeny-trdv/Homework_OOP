import java.util.Random;

public class Slytherin extends Hogwarts{
    private final int trick;
    private final int determination;
    private final int resourcefulness;
    private final int ambition;
    private final int thirstOfPower;

    public Slytherin(String firstName, String lastName, int powerMagic, int distanceOfTransgression, int trick, int determination, int ambition, int resourcefulness, int thirstOfPower) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    public static void bestSlytherin (Slytherin slytherinOne, Slytherin slytherinTwo) {
        int sumSlytherinOne = slytherinOne.getTrick() + slytherinOne.getDetermination() + slytherinOne.getAmbition() + slytherinOne.getResourcefulness() + slytherinOne.getThirstOfPower();
        int sumSlytherinTwo = slytherinTwo.getTrick() + slytherinTwo.getDetermination() + slytherinTwo.getAmbition() + slytherinTwo.getResourcefulness() + slytherinTwo.getThirstOfPower();
        if (sumSlytherinOne > sumSlytherinTwo) {
            System.out.println(slytherinOne.getFirstName() + " лучше Слизиринц, чем " + slytherinTwo.getFirstName());
        } else if (sumSlytherinOne < sumSlytherinTwo) {
            System.out.println(slytherinTwo.getFirstName() + " лучше Слизиринц, чем " + slytherinOne.getFirstName());
        } else {
            System.out.println("У учеников одинаковые баллы");
        }
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstOfPower() {
        return thirstOfPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", хитрость " + trick +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + thirstOfPower;
    }

    public void printStudent() {
        System.out.println(getFirstName() + " " + getLastName() + ", уровень магической силы " + getPowerMagic() +
                ", дистанция трансгрессии " + getDistanceOfTransgression() + ", хитрость " + getTrick() +
                ", решительность " + getDetermination() + ", амбициозность " + getAmbition()
                + ", находчивость " + getResourcefulness() + ", жажда власти " + getThirstOfPower());
    }
}

