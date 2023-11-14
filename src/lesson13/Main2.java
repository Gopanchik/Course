package lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> listIterator = numbers.iterator();

        while (listIterator.hasNext()) {
            int value = listIterator.next();
            listIterator.remove();
            numbers.add(value + 1);
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
//