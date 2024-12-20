public class Main {
    public static void main(String[] args) {
        // 1. Create mediator
        CoolingSystemMediatorImpl mediator = new CoolingSystemMediatorImpl();

        // 2. Create colleagues
        Button button = new Button(mediator);
        Fan fan = new Fan(mediator);
        PowerSupply powerSupply = new PowerSupply(mediator);

        // 3. Register colleagues with mediator
        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupply(powerSupply);

        // 4. Simulate pressing the button multiple times
        System.out.println("First Press");
        button.press(); // Expected: turn on power supply, then turn on fan

        System.out.println("\nSecond Press");
        button.press(); // Expected: turn off fan, then turn off power supply

        System.out.println("\nThird Press");
        button.press(); // Expected: again turn on power supply, then turn on fan
    }
}
