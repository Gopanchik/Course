package lesson10;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass("First", "Second");


        System.out.println(instance.publicField);
        System.out.println(instance.protectedField);
        instance.show();
    }
}
