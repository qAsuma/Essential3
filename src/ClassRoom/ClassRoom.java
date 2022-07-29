package ClassRoom;
//Создать класс, представляющий учебный класс ClassRoom.
//Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
//переопределите каждый из методов, в зависимости от успеваемости ученика.
//Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
//Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
//отдыхать.

import java.util.Arrays;
import java.util.List;

public class ClassRoom {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("Andrei");
        Pupil exelentPupil = new ExelentPupil("Petya");
        Pupil goodPupil = new GoodPupil("Yaro");
        Pupil badPupil = new BadPupil("Ivan");


        List<Pupil> pupils = Arrays.asList(pupil, exelentPupil, goodPupil, badPupil);
        for (Pupil p : pupils) {
            p.study();
            p.read();
            p.write();
            p.relax();


        }
    }
}



