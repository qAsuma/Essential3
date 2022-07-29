package ClassRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pupil {
    private String name;

    public Pupil(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(toString()+"Учусь");
    }

    public void read() {
        System.out.println("Читаю");
    }

    public void write() {
        System.out.println("Пишу");
    }

    public void relax() {
        System.out.println("отдыхаю");
    }

    @Override
    public String toString() {
        return  name + "," ;
    }


}

