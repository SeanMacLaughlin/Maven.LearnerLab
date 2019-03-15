package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    Student sean;

    @Before
    public void setUp() {
        sean = new Student(69);
        sean.setName("Sean");
    }

    @Test
    public void testAdd() {
        // Given
        ArrayList personList = new ArrayList();
        Integer expected = 1;

        // When
        personList.add(sean);
        Integer actual = personList.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        // Given
        ArrayList personList = new ArrayList();
        Integer expected = 1;
        Person jawn = new Person(17);
        jawn.setName("Jawn");

        // When
        personList.add(sean);
        personList.add(jawn);
        personList.remove(1);
        Integer actual = personList.size();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFindById() {
        // Given
        Instructors people = Instructors.getInstance();
        Person expected = people.getPersonList().get(1);

        // When
        Person actual = people.findById(22);

        // Then
        Assert.assertEquals(expected, actual);

    }

}



// Given
// When
// Then