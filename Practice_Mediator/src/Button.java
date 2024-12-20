public class Button extends CoolingSystemComponent {

    public Button(CoolingSystemMediator mediator) {
        super(mediator);
    }

    public void press() {
        System.out.println("Button is pressed.");
        mediator.notifyColleague(this, "BUTTON_PRESSED");
    }
}
