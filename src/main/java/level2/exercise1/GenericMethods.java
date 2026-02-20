package level2.exercise1;

public class GenericMethods {
    public <T1, T2> void printElements(T1 e1, T2 e2, String fixedString) {
        System.out.println("Element 1: " + e1);
        System.out.println("Element 2: " + e2);
        System.out.println("String 3: " + fixedString);
    }
}
