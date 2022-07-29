package Vehicle;
//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.

public class Vehicle {
    public int price;
    public int speed;
    public int year;

    public Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public static void main(String[] args) {
        Plane plane = new Plane(1500000, 800, 2020, 7000, 50);
        Ship ship = new Ship(1500000, 100, 2019, 150, "какойто порт");
        Car car = new Car(10000, 220, 2010);
        System.out.println(plane);
        System.out.println(car);
        System.out.println(ship);
    }
}
