package level3.exercise1;


public class GenericsUtilsMain {
    public static void main (String[] args) {
        Smartphone sp = createSmartphone();

        useSmartphoneDirectly(sp);
        GenericUtils.usePhone(sp);
        GenericUtils.useSmartphone(sp);
    }

    private static Smartphone createSmartphone() {
        return new Smartphone();
    }

    private static void useSmartphoneDirectly(Smartphone sp) {
        sp.call();
        sp.takePhoto();
    }
}
