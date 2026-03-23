package level1.exercise2;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = createPerson();
        printPerson(p1);
        runGenericExameples();


    }

    private static Person createPerson() {
        return new Person("Jaime", "Tarlote", 35);
    }

    private static void printPerson(Person p) {
        System.out.println(p);
    }

    private static void runGenericExameples() {
        GenericMethods gm1 = new GenericMethods();

        gm1.printElements("P", "Porras", 45);
        gm1.printElements(65, "Paco", 4.5);
        gm1.printElements(createPerson(), "Paco", 3.4);
    }
}
