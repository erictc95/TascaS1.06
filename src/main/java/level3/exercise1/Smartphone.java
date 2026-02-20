package level3.exercise1;

public class Smartphone implements Phone{

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    public void takePhoto() {
        System.out.println("The phone is taking a photo!");
    }


}
