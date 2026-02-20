package level1.exercise2;

public class GenericMethods {
    public <T1, T2, T3> void printElements(T1 e1, T2 e2, T3 e3) {
        System.out.println("Element 1: " + e1);
        System.out.println("Element 2: " + e2);
        System.out.println("Element 3: " + e3);
    }
}
