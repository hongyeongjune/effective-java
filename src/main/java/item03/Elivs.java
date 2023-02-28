package item03;

public class Elivs implements InterfaceElivs {
    private static final Elivs INSTANCE = new Elivs();

    private Elivs() {
    }

    public static Elivs getInstance() {
        return INSTANCE;
    }

    public void sing() {
        System.out.println("I am singing");
    }

    @Override
    public void dance() {
        System.out.println("I am dancing");
    }
}
