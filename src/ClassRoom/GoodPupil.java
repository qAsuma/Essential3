package ClassRoom;

public class GoodPupil extends Pupil {
    public GoodPupil(String name) {
        super(name);
    }

    public void study() {
        System.out.println(toString()+"нормально Учусь");
    }

    public void read() {
        System.out.println("иногда Читаю");
    }

    public void write() {
        System.out.println("что-то Пишу");
    }

    public void relax() {
        System.out.println("достаточно отдыхаю");
    }



}
