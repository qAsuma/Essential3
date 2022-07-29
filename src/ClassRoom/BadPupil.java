package ClassRoom;

public class BadPupil extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    public void study() {
        System.out.println(toString()+"Не Учусь");
    }

    public void read() {
        System.out.println("Не Читаю");
    }

    public void write() {
        System.out.println("не Пишу");
    }

    public void relax() {
        System.out.println("Отдыхаю");
    }

}
