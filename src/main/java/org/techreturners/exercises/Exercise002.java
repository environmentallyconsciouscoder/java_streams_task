package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise002 {

    public static void main(String[] args) throws IOException {

        sortPeopleByAge();
        tenMostExpensiveRedCars();

    }

    public static void sortPeopleByAge() throws IOException {
        // My list of people is unsorted, and I'd like it to be in age order
        // Please return the results from the lowest to the highest age

        List<Person> people = MockData.getPeople();

    }


    public static void tenMostExpensiveRedCars() throws IOException {
        // I've grown to be accustomed to expensive tastes and want to blow some cash on a new car
        // return the top ten most expensive cars from the list
        // Oh, also it has to be Red!

        List<Car> cars = MockData.getCars();

        // write your solution here

    }
}
