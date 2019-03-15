package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    private static  ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static  Students students = Students.getInstance();
    private static  Instructors instructors = Instructors.getInstance();


    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }





}
