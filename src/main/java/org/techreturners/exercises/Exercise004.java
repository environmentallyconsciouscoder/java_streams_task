package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.data_models.PersonDTO;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

public class Exercise004 {

    public static void main(String[] args) throws IOException {

//        findAverageCarPrice();
        dataFilteringAndTransformation();

    }

    public static void findAverageCarPrice() throws IOException {
        // Using streams() API find the average car price (to the nearest whole number) from the list of cars
        // Output the resulting double value to the console
        List<Car> cars = MockData.getCars();
        OptionalDouble averagePrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .average();
        System.out.println(averagePrice.getAsDouble());


        // write your solution here

    }

    public static void dataFilteringAndTransformation() throws IOException {
        // I would like to do some object transformation and see a list of PersonDTO objects
        // for all people over the age of 65
        // The PersonDTO can be found in /data_models
        // Print the result to the console
        List<Person> people = MockData.getPeople();

        List<Person> filteredPeople = people.stream()
                .filter(p -> p.getAge() > 65)
                .collect(Collectors.toList());

        List<PersonDTO> personDTOS = new ArrayList<>();

        filteredPeople.forEach(p -> {
            personDTOS.add(new PersonDTO(p.getId(), p.getFirstName(), p.getAge()));
        });

        personDTOS.forEach(System.out::println);

        // write your solution here
    }


}
