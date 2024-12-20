public abstract class CoolingSystemComponent {
    protected CoolingSystemMediator mediator;

    public CoolingSystemComponent(CoolingSystemMediator mediator) {
        this.mediator = mediator;
    }

    // Additional common functionality can go here
}
