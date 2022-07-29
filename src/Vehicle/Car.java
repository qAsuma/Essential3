package Vehicle;

public class Car extends Vehicle {
    public int price;
    public int speed;
    public int year;

    public String toString() {
        return "Car{price=" + this.price + ", speed=" + this.speed + ", year=" + this.year + "}";
    }

    public Car(int price, int speed, int year) {
        super(price, speed, year);
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
}
