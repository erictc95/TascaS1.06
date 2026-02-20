package level2.exercise2;

public class GenericMethods {
    public <T> void printAll(String fixedString, T... items) {
        for(T element : items) {
            System.out.println(fixedString + ", " + element);
        }
    }
}
