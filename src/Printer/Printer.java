package Printer;
//Используя IntelliJ IDEA, создайте проект. Требуется: Создайте класс Printer.
// В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
// Реализуйте возможность того, чтобы в случае наследования от данного класса других классов,
// и вызове соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов, выводились разными цветами.
// Обязательно используйте приведение типов.

public class Printer {
    public void print(String value) {

    }

    public static void main(String[] args) {
        ColorPrinter colorPrinter = new ColorPrinter();
        Printer printer = colorPrinter;

//        Printer cp = new ColorPrinter();

        printer.print("привет");


    }
}
