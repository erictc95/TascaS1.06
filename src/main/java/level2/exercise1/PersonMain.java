package level2.exercise1;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = createPerson();
        printPerson(p1);
        runGenericExamples();
    }

    private static Person createPerson() {
        return new Person("Jaime", "Tarlote", 35);
    }

    private static void printPerson(Person p) {
        System.out.println(p);
    }

    private static void runGenericExamples() {
        GenericMethods gm1 = new GenericMethods();
        gm1.printElements("P", 100, "Garleone");
        gm1.printElements(65, 4.2, "SixSeven");
        gm1.printElements(createPerson(), 2.6,"Paco");
    }
}
