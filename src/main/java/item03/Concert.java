package item03;

public class Concert {
    private final InterfaceElivs elivs;

    public Concert(InterfaceElivs elivs) {
        this.elivs = elivs;
    }

    public void perform() {
        elivs.dance();
    }
}
