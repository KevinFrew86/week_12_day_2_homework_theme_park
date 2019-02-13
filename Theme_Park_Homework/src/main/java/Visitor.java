public class Visitor {

    private int age;
    private double height;
    private int money;

    public Visitor(int age, double height, int money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getMoney() {
        return money;
    }
}
