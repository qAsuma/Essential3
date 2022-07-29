package Vehicle;

public class Ship extends Vehicle {
    public int price;
    public int speed;
    public int year;
    public int passengers;
    public String port;

    public String toString() {
        return "Ship{price=" + this.price + ", speed=" + this.speed + ", year=" + this.year + ", passengers=" + this.passengers + ", port='" + this.port + "'}";
    }

    public Ship(int price, int speed, int year, int passengers, String port) {
        super(price, speed, year);
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.passengers = passengers;
        this.port = port;
    }
}
