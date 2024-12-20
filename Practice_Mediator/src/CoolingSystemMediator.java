public interface CoolingSystemMediator {
    // Method called by colleagues to notify the mediator of some event
    void notifyColleague(CoolingSystemComponent sender, String event);
}
