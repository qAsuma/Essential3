package Printer;

public class ColorPrinter extends Printer{
    @Override
    public void print(String value) {
        super.print(value);
        System.out.println(value + " red");
        System.out.println(value + " blue");
        System.out.println(value + " white");

    }
}
