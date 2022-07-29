package ClassRoom;

public class ExelentPupil extends Pupil {
    public ExelentPupil(String name) {
        super(name);
    }


    public void study() {
        System.out.println(toString()+"Хорошо Учусь");
    }

    public void read() {
        System.out.println("Много Читаю");
    }

    public void write() {
        System.out.println("Много Пишу");
    }

    public void relax() {
        System.out.println("не отдыхаю");
    }


}
