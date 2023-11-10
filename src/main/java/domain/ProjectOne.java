package domain;

import java.util.*;

public class ProjectOne {



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

    private void maxEnhancedFor(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            if (number > result) {
                result = number;
            }
        }
        System.out.println(result);
    }

    private void maxIterator(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        int result = 0;
        while (iterator.hasNext()){
            Integer number = iterator.next();

            if(number > result){
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
