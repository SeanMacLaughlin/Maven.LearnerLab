package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

            // Given
            long expected = 0;

            // When
            Person person = new Person(expected);

            // Then
            long actual = person.getId();
            Assert.assertEquals(expected, actual);
        }



    @Test
    public void testSetName() {
        // Given
        Person person = new Person(69);
        String expected = "Sean";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
