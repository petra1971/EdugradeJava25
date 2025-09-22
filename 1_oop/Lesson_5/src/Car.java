public class Car {
    int year;
    String brand;
    String model;

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;

        System.out.println("This car is of brand " + brand + " and model is " + model + " and it's from year " + year);

    }
    public Car() {

    }
}
