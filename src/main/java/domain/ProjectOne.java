package domain;

import java.util.*;

public record ProjectOne(UUID id, String name, Double price) {
    public ProjectOne(UUID id, String name, Double price) {
        this.id = Objects.requireNonNullElseGet(id, UUID::randomUUID);
        this.name = name;
        this.price = price;

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        this.maxIterator(numbers);
        this.maxEnhancedFor(numbers);
    }

    public String toString() {
        return this.name;
    }

    private void maxEnhancedFor(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            if (number > result) {
                result = number;
            }
        }
    }

    private void maxIterator(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            Integer number = iterator.next();

            if (number > result) {
                result = number;
            }
        }
    }
}
