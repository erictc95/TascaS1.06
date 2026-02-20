package level3.exercise1;


public class GenericsUtilsMain {
    public static void main (String[] args) {
        Smartphone sp = new Smartphone();
        //sp llama a call
        sp.call();
        //sp llama a takephoto
        sp.takePhoto();
        //GenericUtils usa phone que solo puede llamar pasandole new sp
        GenericUtils.usePhone(sp);
        //GenericUtils usa smartphone que puede llamar y hacer fotos pasandose el new sp
        GenericUtils.useSmartphone(sp);
    }
}
