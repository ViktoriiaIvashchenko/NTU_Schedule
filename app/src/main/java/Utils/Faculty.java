package Utils;

public class Faculty {

    private int id_f;
    private String faculty_name;

//конструктори таблиці Факультет
    public Faculty() {}

    public Faculty(int id_f, String faculty_name) {
        this.id_f = id_f;
        this.faculty_name = faculty_name;
    }

    public Faculty(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    //додаємо гетери і сеттери
    public int getId_f() {
        return id_f;
    }

    public void setId_f(int id_f) {
        this.id_f = id_f;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    @Override
    public String toString() {
        return faculty_name; // Повертаємо лише назву факультету для представлення у ListView
    }
}
