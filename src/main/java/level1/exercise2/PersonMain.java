package level1.exercise2;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Jaime", "Tarlote", 35);
        System.out.println(p1);

        GenericMethods gm1 = new GenericMethods();
        gm1.printElements("P", "Porras", 45);
        gm1.printElements(65, "Paco", 4.5);
        gm1.printElements(p1, "Paco", 3.4);

    }
}
