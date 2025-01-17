package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise001 {

    public static void main(String[] args) throws Exception {

        filterCars();
        findPerson();

    }

    public static void filterCars() throws Exception {
        // I'm in the market to buy a new car, and I'm looking for something very particular:
        // It has to be made in or before 2001, cost 30000 or less, and be coloured Green.
        // I would like the results printed out to the console
        // I have provided you with the list of cars to find these from below:
        List<Car> cars = MockData.getCars();
        cars.stream()
                .filter(c -> c.getYear() <= 2001 && c.getPrice() <= 30000 && c.getColour().equals("Green")).collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void findPerson() throws IOException {
        // I'm looking for the details of someone in particular and I don't have much to go on
        // All I know is that it's a Male, older than 30, who's initials are A M.
        // Can you find people who match this to help whittle down my search?
        // Output your result to the console

        List<Person> people = MockData.getPeople();
        people.stream()
                .filter(p -> p.getAge() > 30 && p.getFirstName().startsWith("A") && p.getLastName().startsWith("M"))
                .forEach(System.out::println);
    }
}
