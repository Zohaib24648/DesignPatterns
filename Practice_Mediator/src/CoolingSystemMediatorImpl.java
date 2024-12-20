public class CoolingSystemMediatorImpl implements CoolingSystemMediator {
    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    // Called once to set all colleagues
    public void setButton(Button button) {
        this.button = button;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void notifyColleague(CoolingSystemComponent sender, String event) {
        // Handle interactions based on event
        if (sender instanceof Button && event.equals("BUTTON_PRESSED")) {
            // Toggle the fan
            if (fan.isOn()) {
                // Turn fan off first
                fan.turnOff();
                // Then turn off the power supply
                powerSupply.turnOff();
            } else {
                // Turn on power supply first
                powerSupply.turnOn();
                // Then turn on the fan
                fan.turnOn();
            }
        }
        // We could handle other event types as needed
    }
}
