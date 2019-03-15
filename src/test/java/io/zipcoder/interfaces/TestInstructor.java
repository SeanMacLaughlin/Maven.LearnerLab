package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(72);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(72);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        // Given
        Instructor instructor = new Instructor(72);
        Student student = new Student(69);
        double expected = 10.0;

        // When
        instructor.teach(student, 10.0);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testLecture() {
        // Given
        Instructor instructor = new Instructor(72);
        Student[] students = new Student[3];
        double expected = 5.0;

        // When
        instructor.lecture(students, 15.0);
        double actual = 15.0 / students.length;

        // Then
        Assert.assertEquals(expected, actual, 0.1);
    }
}
