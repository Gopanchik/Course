package lesson13;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Main1{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {
            int value = listIterator.next();
            listIterator.set(value + 1);
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
