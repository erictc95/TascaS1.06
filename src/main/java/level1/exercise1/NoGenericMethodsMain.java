package level1.exercise1;

public class NoGenericMethodsMain {


    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("Enrique", "Iglesias", "Junior");
        NoGenericMethods obj2 = new NoGenericMethods("Iglesias", "Junior", "Enrique");

        System.out.println("Element 1: " + obj1.getElement1() + " - " + "Element 1: " + obj2.getElement1());
        System.out.println("Element 2: " + obj1.getElement2() + " - " +  "Element 2: " + obj2.getElement2());
        System.out.println("Element 3: " + obj1.getElement3() + " - " +  "Element 3: " + obj2.getElement3());
    }
}

