package Utils;

public class Teacher {

    private int id_f;
    private String teacher_name;

    public Teacher() { }

    public Teacher(int id_f, String teacher_name) {
        this.id_f = id_f;
        this.teacher_name = teacher_name;
    }

    public Teacher(int id_f) {
        this.id_f = id_f;
    }

    public int getId_f() {
        return id_f;
    }

    public void setId_f(int id_f) {
        this.id_f = id_f;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String toString() {
        return teacher_name; // Повертаємо лише ПІБ викладача для представлення у ListView
    }
}
