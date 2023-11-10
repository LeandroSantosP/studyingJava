package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ProjectOne {



    public ProjectOne(UUID id, String name, Double price) {
        this.id = Objects.requireNonNullElseGet(id, UUID::randomUUID);
        this.name = name;
        this.price = price;

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1212);
        this.max(numbers);
    }

    private void max(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            if (number > result) {
                result = number;
            }
        }
        System.out.println(result);
    }

    private final UUID id;
    public final String name;
    public final Double price;
    public UUID getId() {
        return id;
    }
}
