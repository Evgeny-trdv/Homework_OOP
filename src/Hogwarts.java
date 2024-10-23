import java.util.Objects;

public class Hogwarts {
    private final String firstName;
    private final String lastName;
    private int powerMagic;
    private int distanceOfTransgression;

    public Hogwarts(String firstName, String lastName, int powerMagic, int distanceOfTransgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerMagic = powerMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public static void bestStudentInPowerMagic(Hogwarts hogwartsOne, Hogwarts hogwartsTwo) {  //метод сравнения учеников по силе магии
        if (hogwartsOne.getPowerMagic() > hogwartsTwo.getPowerMagic()) {
            System.out.println(hogwartsOne.getFirstName() + " имеет силу магии больше, чем " + hogwartsTwo.getFirstName());
        } else if (hogwartsOne.getPowerMagic() < hogwartsTwo.getPowerMagic()) {
            System.out.println(hogwartsTwo.getFirstName() + " имеет силу магии больше, чем " + hogwartsOne.getFirstName());
        } else {
            System.out.println("У " + hogwartsOne.getFirstName() + " и " + hogwartsTwo.getFirstName() + " сила магии одинакова");
        }
    }

    public static void bestStudentInDistanceTransgression(Hogwarts hogwartsOne, Hogwarts hogwartsTwo) {  //метод сравнения учеников по дистанции трансгрессии
        if (hogwartsOne.getDistanceOfTransgression() > hogwartsTwo.getDistanceOfTransgression()) {
            System.out.println(hogwartsOne.getFirstName() + " может трансгрессировать на большее расстояние, чем " + hogwartsTwo.getFirstName());
        } else if (hogwartsOne.getDistanceOfTransgression() < hogwartsTwo.getDistanceOfTransgression()) {
            System.out.println(hogwartsTwo.getFirstName() + " может трансгрессировать на большее расстояние, чем " + hogwartsOne.getFirstName());
        } else {
            System.out.println("У " + hogwartsOne.getFirstName() + " и " + hogwartsTwo.getFirstName() + " дистанция трансгрессии одинакова");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", уровень магической силы " + powerMagic +
                ", дистанция трансгрессии " + distanceOfTransgression;
    }
}
