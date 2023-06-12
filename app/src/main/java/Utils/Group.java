package Utils;

public class Group {

    private int id_g;
    private String group_name;

    public Group() { }

    public Group(int id_g, String group_name) {
        this.id_g = id_g;
        this.group_name = group_name;
    }

    public Group(String group_name) {
        this.group_name = group_name;
    }

    public int getId_g() {
        return id_g;
    }

    public void setId_g(int id_g) {
        this.id_g = id_g;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    public String toString() {
        return group_name; // Повертаємо лише назву групи для представлення у ListView
    }
}
