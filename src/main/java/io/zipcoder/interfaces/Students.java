package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();


    private Students() {
        Student sean = new Student(69);
        sean.setName("Sean");
        Student glock = new Student(420);
        glock.setName("Glock");
        Student chip = new Student(55);
        chip.setName("Chip");
        Student mac = new Student(117);
        mac.setName("Mac");
        Student maynard = new Student(1337);
        maynard.setName("Maynard");

        super.add(sean);
        super.add(glock);
        super.add(chip);
        super.add(mac);
        super.add(maynard);

        }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] getArray() {
        return INSTANCE.getPersonList().toArray(new Student[INSTANCE.getCount()]);

    }

}
