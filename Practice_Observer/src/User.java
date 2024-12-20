public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Newsletter newsletter, String message) {
        System.out.println("Notification for " + name + ":");
        System.out.println("Newsletter: " + newsletter.getTitle());
        System.out.println("Update: " + message);
        System.out.println("---");
    }
}
