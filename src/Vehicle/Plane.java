package Vehicle;

public class Plane extends Vehicle {
    public int price;
    public int speed;
    public int year;
    public int height;
    public int passengers;

    public String toString() {
        return "Plane{price=" + this.price + ", speed=" + this.speed + ", year=" + this.year + ", height=" + this.height + ", passengers=" + this.passengers + "}";
    }

    public Plane(int price, int speed, int year, int height, int passengers) {
        super(price, speed, year);
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.passengers = passengers;
    }
}