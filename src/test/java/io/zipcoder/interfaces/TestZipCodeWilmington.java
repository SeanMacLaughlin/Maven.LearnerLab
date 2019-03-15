package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        // Given
        Student student = new Student(123);
        Instructor instructor = new Instructor(124);
        Student[] studs = new Student[2];

        double expected = 5.0;
        studs[0] = student;


        instructor.lecture(studs, 5.0);


        // When
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.1);



    }


}
// Given
// When
// Then