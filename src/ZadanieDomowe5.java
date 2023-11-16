public class ZadanieDomowe5 implements Vehicle {
    private String make;
    private String color;
    private String model;
    private int year;

    public ZadanieDomowe5(String make, String color, String model, int year) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        ZadanieDomowe5 car1 = new ZadanieDomowe5("Toyota", "Red", "Corolla", 2020);
        ZadanieDomowe5 car2 = new ZadanieDomowe5("Honda", "Blue", "Civic", 2021);

        System.out.println(car1);
        car1.start();
        car1.stop();

        System.out.println(car2);
        car2.start();
        car2.stop();
    }
}