package domain;

import java.util.Iterator;
import java.util.List;

public class Generics {
    static <T> void Testing(List<T> s) {
        Iterator<T> it = s.iterator();
        while(it.hasNext()) {
        }
    }
}
