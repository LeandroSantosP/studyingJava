package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class GenericsTest {


    @Test
    void workingWithGenerics() {
        List<Long> myList = new ArrayList<Long>();
        myList.add(12L);
        myList.add(12L);
        myList.add(12L);
        Generics.Testing(myList);
    }

}