package Utils;

public class Util {
    public static final String DATABASE_NAME = "NTU_DB_v1.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_FACULTY ="Faculty";
    public static final String COLUMN_F_ID = "_id";
    public static final String COLUMN_F_NAME= "faculty_name";

    public static final String TABLE_CLASSTIME ="Classtime";
    public static final String COLUMN_CT_ID = "_id";
    public static final String COLUMN_CT_TIME= "time_class";

    public static final String TABLE_CORPS ="Corps";
    public static final String COLUMN_C_ID = "_id";
    public static final String COLUMN_C_NAME= "address_name";

    public static final String TABLE_GROUPS ="Groups";
    public static final String COLUMN_G_ID = "_id";
    public static final String COLUMN_G_F_NAME= "faculty_id_name";
    public static final String COLUMN_G_COURSE= "course";
    public static final String COLUMN_G_NAME= "groups_name";

    public static final String TABLE_SCHEDULE ="Schedule";
    public static final String COLUMN_SC_ID = "_id";
    public static final String COLUMN_SC_WEEK_NUMB= "week_numb";
    public static final String COLUMN_SC_WEEKDAY_N= "weekday_n";
    public static final String COLUMN_SC_CLASS_TIME_N= "class_time_n";
    public static final String COLUMN_SC_GROUP_N= "group_n";
    public static final String COLUMN_SC_SUBJECT_N= "subject_n";
    public static final String COLUMN_SC_TEACHER_N= "teacher_n";
    public static final String COLUMN_SC_AUDIENCE= "audience";
    public static final String COLUMN_SC_CORPS_N= "corps_n";

    public static final String TABLE_SUBJECT ="Subject";
    public static final String COLUMN_S_ID = "_id";
    public static final String COLUMN_S_NAME= "subject_name";

    public static final String TABLE_TEACHERS ="Teachers";
    public static final String COLUMN_T_ID = "_id";
    public static final String COLUMN_T_WEEK_NUMB= "teacher_name";
    public static final String COLUMN_T_WEEKDAY_N= "rank_t";

    public static final String TABLE_WEEKDAY ="Weekday";
    public static final String COLUMN_W_ID = "_id";
    public static final String COLUMN_W_WEEK_NUMB= "day_name";

}
