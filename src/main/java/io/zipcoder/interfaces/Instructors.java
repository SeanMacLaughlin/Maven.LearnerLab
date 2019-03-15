package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {
        Instructor ben = new Instructor(11);
        ben.setName("Dover");
        Instructor amanda = new Instructor(22);
        amanda.setName("Luvenkis");
        Instructor moe = new Instructor(33);
        moe.setName("Diggity");
        Instructor al = new Instructor(44);
        al.setName("Coholic");
        Instructor seymour = new Instructor(55);
        seymour.setName("Butts");

        super.add(ben);
        super.add(amanda);
        super.add(moe);
        super.add(al);
        super.add(seymour);
    }

    public Instructor[] getArray() {
        return INSTANCE.getPersonList().toArray(new Instructor[INSTANCE.getCount()]);
    }
}
