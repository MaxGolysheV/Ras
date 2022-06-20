package com.example.raspisanie;

public class Model {

    private String day;
    private String lesson1;
    private String teacher1;
    private String lesson2;
    private String teacher2;
    private String lesson3;
    private String teacher3;
    private String lesson4;
    private String teacher4;
    private String lesson5;
    private String teacher5;

    public Model(String day, String lesson1, String teacher1, String lesson2, String teacher2, String lesson3,
                 String teacher3, String lesson4, String teacher4,String lesson5, String teacher5) {
        this.day = day;
        this.lesson1 = lesson1;
        this.teacher1 = teacher1;
        this.lesson2 = lesson2;
        this.teacher2 = teacher2;
        this.lesson3 = lesson3;
        this.teacher3 = teacher3;
        this.lesson4 = lesson4;
        this.teacher4 = teacher4;
        this.lesson5 = lesson5;
        this.teacher5 = teacher5;
    }

    public String getDay() { return day; }
    public String getLesson1() { return lesson1; }
    public String getTeacher1() { return teacher1; }
    public String getLesson2() { return lesson2; }
    public String getTeacher2() { return teacher2; }
    public String getLesson3() { return lesson3; }
    public String getTeacher3() { return teacher3; }
    public String getLesson4() { return lesson4; }
    public String getTeacher4() { return teacher4; }
    public String getLesson5() { return lesson5; }
    public String getTeacher5() { return teacher5; }
}
