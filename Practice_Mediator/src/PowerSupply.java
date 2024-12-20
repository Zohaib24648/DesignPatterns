public class PowerSupply extends CoolingSystemComponent {
    private boolean isPowered;

    public PowerSupply(CoolingSystemMediator mediator) {
        super(mediator);
        this.isPowered = false;
    }

    public void turnOn() {
        isPowered = true;
        System.out.println("Power supply turned ON.");
    }

    public void turnOff() {
        isPowered = false;
        System.out.println("Power supply turned OFF.");
    }

    public boolean isPowered() {
        return isPowered;
    }
}
