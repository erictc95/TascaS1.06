package level2.exercise2;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Jaime", "Tarlote", 35);
        System.out.println(p1);

        GenericMethods gm = new GenericMethods();
        gm.printAll("Fixed", p1, "Que tal?", 56, 4.7, "Gemelos?");
        gm.printAll("Fixed", "Quien?", 3.4, p1);

    }
}
