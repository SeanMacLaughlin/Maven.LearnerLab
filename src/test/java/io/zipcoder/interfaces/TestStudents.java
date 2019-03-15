package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {
    @Test
    public void testStudentsSingleton() {

        // Given
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

        List<Student> expected = new ArrayList<Student>();

        expected.add(sean);
        expected.add(glock);
        expected.add(chip);
        expected.add(mac);
        expected.add(maynard);


        // When
        Students actual = Students.getInstance();
        boolean expected1 = true;

        for (int i = 0; i < actual.getCount(); i++) {
            if (((actual.getPersonList().get(i).getId() == expected.get(i).getId()) ||
                    (actual.getPersonList().get(i).getName().equals(expected.get(i).getName())))) {
                expected1 = true;
            } else {
                expected1 = false;
            }

                // Then
                Assert.assertTrue(expected1);

        }
    }
}
// Given
// When
// Then