package Animals;

public class Monkey extends Zoo {
    public Monkey(String name, int age, double weight , String type) {
        super(name, age, weight , type);
    }

    @Override
    public void sound() {
        System.out.println("Uhhh Ahhh !");
    }

    @Override
    public double food() {
        double dailyfood = getweight() * 0.05;
        System.out.println(dailyfood);
        return dailyfood;
    }

    @Override
    public void movement() {
        System.out.println("Climb Tree ");
    }
}
