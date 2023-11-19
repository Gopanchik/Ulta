package lesson16;

public class Animals {
    private int age;

    public static void main(String[] args) {
        Animals animal = new Animals(7);
        System.out.println(animal);
    }

    public Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Назва: " + this.getClass().getSimpleName() + ", Вік: " + age;
    }

}
