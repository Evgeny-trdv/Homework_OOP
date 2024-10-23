public class Puffenduy extends Hogwarts{
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Puffenduy(String firstName, String lastName, int powerMagic, int distanceOfTransgression, int diligence, int loyalty, int honesty) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void bestPuffenduy (Puffenduy puffenduyOne, Puffenduy puffenduyTwo) {
        int sumPuffenduyOne = puffenduyOne.getDiligence() + puffenduyOne.getLoyalty() + puffenduyOne.getHonesty();
        int sumPuffenduyTwo = puffenduyTwo.getDiligence() + puffenduyTwo.getLoyalty() + puffenduyTwo.getHonesty();
        if (sumPuffenduyOne > sumPuffenduyTwo) {
            System.out.println(puffenduyOne.getFirstName() + " лучше Пуффендуец, чем " + puffenduyTwo.getFirstName());
        } else if (sumPuffenduyOne < sumPuffenduyTwo) {
            System.out.println(puffenduyTwo.getFirstName() + " лучше Пуффендуец, чем " + puffenduyOne.getFirstName());
        } else {
            System.out.println("У учеников одинаковые баллы");
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбие " + diligence +
                ", верность " + loyalty +
                ", честность " + honesty;
    }

    public void printStudent() {
        System.out.println(getFirstName() + " " + getLastName() + ", уровень магической силы " + getPowerMagic() +
                ", дистанция трансгрессии " + getDistanceOfTransgression()+ ", трудолюбие " + getDiligence() +
                ", верность " + getLoyalty() + ", честность " + getHonesty());
    }
}
