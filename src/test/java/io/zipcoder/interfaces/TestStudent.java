package io.zipcoder.interfaces;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        Student student = new Student(69);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(69);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
       // Given
        Student student = new Student(69);
        double expected = 5.0;

        // When
        student.learn(5.0);
        double actual = student.getTotalStudyTime();


        // Then
        Assert.assertEquals(expected, actual, 0.1);


    }

}
