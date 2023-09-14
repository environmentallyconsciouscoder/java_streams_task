package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;

public class Exercise003 {

    public static void main(String[] args) throws IOException {

        groupByColour();

    }

    public static void groupByColour() throws IOException {
        // I would like information for some cars returned in a specific way.
        // I'm looking for cars that are less than 20000 and made in 1995
        // Group the results together by their colour and print to the console

        List<Car> cars = MockData.getCars();
        cars.stream()
                .filter(c -> c.getPrice() < 20000 && c.getYear().equals(1995))
                .collect(groupingBy(Car::colour))
                .entrySet()
                .forEach(entry -> {
                    System.out.println("Color: " + entry.getKey());
                    entry.getValue().forEach(System.out::println);
                });

        // write your solution here

    }
}

