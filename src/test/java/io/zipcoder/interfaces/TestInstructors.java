package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {
    @Test
    public void testInstructorsSingleton() {
        // Given
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

        List<Instructor> expected = new ArrayList<Instructor>();

        expected.add(ben);
        expected.add(amanda);
        expected.add(moe);
        expected.add(al);
        expected.add(seymour);

        // When
        Instructors actual = Instructors.getInstance();
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

