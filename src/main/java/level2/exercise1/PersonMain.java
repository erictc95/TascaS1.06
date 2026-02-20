package level2.exercise1;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Jaime", "Tarlote", 35);
        System.out.println(p1);

        GenericMethods gm1 = new GenericMethods();
        gm1.printElements("P", 100, "Garleone");
        gm1.printElements(65, 4.2, "SixSeven");
        gm1.printElements(p1, 2.6,"Paco");

    }
}
