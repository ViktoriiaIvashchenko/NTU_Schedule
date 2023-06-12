package Utils;

public class Schedule {
    private int id_s;
    private int week_numb,weekday,classtime,group,subject,teacher,corps;
    private String audience_numb;

    public Schedule() { }

    public Schedule(int id_s) {
        this.id_s = id_s;
    }

    public Schedule(String audience_numb) {
        this.audience_numb = audience_numb;
    }

    public Schedule(int id_s, int week_numb, int weekday, int classtime, int group, int subject, int teacher, int corps, String audience_numb) {
        this.id_s = id_s;
        this.week_numb = week_numb;
        this.weekday = weekday;
        this.classtime = classtime;
        this.group = group;
        this.subject = subject;
        this.teacher = teacher;
        this.corps = corps;
        this.audience_numb = audience_numb;
    }

    public int getId_s() {
        return id_s;
    }

    public void setId_s(int id_s) {
        this.id_s = id_s;
    }

    public int getWeek_numb() {
        return week_numb;
    }

    public void setWeek_numb(int week_numb) {
        this.week_numb = week_numb;
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public int getClasstime() {
        return classtime;
    }

    public void setClasstime(int classtime) {
        this.classtime = classtime;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public int getCorps() {
        return corps;
    }

    public void setCorps(int corps) {
        this.corps = corps;
    }

    public String getAudience_numb() {
        return audience_numb;
    }

    public void setAudience_numb(String audience_numb) {
        this.audience_numb = audience_numb;
    }
}
