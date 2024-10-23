public class Kogtevran extends Hogwarts{
    private final int smart;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Kogtevran(String firstName, String lastName, int powerMagic, int distanceOfTransgression, int smart, int wisdom, int wit, int creativity) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static void bestKogtevran (Kogtevran kogtevranOne, Kogtevran kogtevranTwo) {
        int sumKogtevranOne = kogtevranOne.getSmart() + kogtevranOne.getWisdom() + kogtevranOne.getWit() + kogtevranOne.getCreativity();
        int sumKogtevranTwo = kogtevranTwo.getSmart() + kogtevranTwo.getWisdom() + kogtevranTwo.getWit() + kogtevranTwo.getCreativity();
        if (sumKogtevranOne > sumKogtevranTwo) {
            System.out.println(kogtevranOne.getFirstName() + " лучше Когтевранец, чем " + kogtevranTwo.getFirstName());
        } else if (sumKogtevranOne < sumKogtevranTwo) {
            System.out.println(kogtevranTwo.getFirstName() + " лучше Когтевранец, чем " + kogtevranOne.getFirstName());
        } else {
            System.out.println("У учеников одинаковые баллы");
        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", смышленность " + smart +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", креативность " + creativity;
    }

    public void printStudent() {
        System.out.println(getFirstName() + " " + getLastName() + ", уровень магической силы " + getPowerMagic() +
                ", дистанция трансгрессии " + getDistanceOfTransgression()+ ", смышленность " + getSmart() +
                ", мудрость " + getWisdom() + ", остроумие " + getWit() + ", креативность " + getCreativity());
    }
}
