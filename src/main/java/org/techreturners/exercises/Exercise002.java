package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise002 {

    public static void main(String[] args) throws IOException {

        sortPeopleByAge();
        sortByCarMakeAndYear();
        tenMostExpensiveRedCars();

    }

    public static void sortPeopleByAge() throws IOException {
        // My list of people is unsorted, and I'd like it to be in age order
        // Please return the results from the lowest to the highest age

        List<Person> people = MockData.getPeople();
        people.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);

    }

    public static void sortByCarMakeAndYear() throws IOException {
        // My list of cars is currently unsorted
        // Please return the results of the list of cars sorted in:
        // Alphabetical order of make
        // Year within each make
        // Print the results of this to the console

        List<Car> cars = MockData.getCars();
        cars.stream().sorted(Comparator.comparing(Car::make).thenComparingInt(Car::year)).forEach(System.out::println);
        // write your solution here
    }


    public static void tenMostExpensiveRedCars() throws IOException {
        // I've grown to be accustomed to expensive tastes and want to blow some cash on a new car
        // return the top ten most expensive cars from the list
        // Oh, also, it has to be Red!

        List<Car> cars = MockData.getCars();
        cars.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).filter(car -> car.colour().equals("Red")).limit(10).forEach(System.out::println);


    }
}
