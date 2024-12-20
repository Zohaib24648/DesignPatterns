public class Fan extends CoolingSystemComponent {
    private boolean isOn;

    public Fan(CoolingSystemMediator mediator) {
        super(mediator);
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Fan turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Fan turned OFF.");
    }
}
