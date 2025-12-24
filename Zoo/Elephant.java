package Animals;

public class Elephant extends Zoo {
    public Elephant(String name, int age, double weight , String type) {
        super(name, age, weight , type);
    }

    @Override
    public void sound() {
        System.out.println("Pawooo");
    }

    @Override
    public double food() {
        double dailyfood = getweight() * 0.12;
        System.out.println(dailyfood);
        return dailyfood;
    }

    @Override
    public void movement() {
        System.out.println("Spray Water");

    }
}
