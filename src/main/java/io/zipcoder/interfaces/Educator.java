package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    BEN("Dover", 11),
    AMANDA("Luvenkis", 22),
    MOE("Diggity", 33),
    AL("Coholic", 44),
    SEYMOUR("Butts", 55);


    private final Instructor instructor;
    private double timeWorked = 0;


    Educator(String name, long id) {
        instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);

        }

    public void teach(Learner learner, double numberOfHours) {
        timeWorked += numberOfHours;
        instructor.teach(learner, numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }
}

