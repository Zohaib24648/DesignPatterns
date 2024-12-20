public class Main {
    public static void main(String[] args) {
        // Create a newsletter (Subject)
        Newsletter newsletter = new Newsletter("Tech Insights", "Issue #1", "Active");

        // Create some users
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        // Register users to receive updates
        newsletter.registerObserver(alice);
        newsletter.registerObserver(bob);
        newsletter.registerObserver(charlie);

        System.out.println("Initial details of the newsletter:");
        System.out.println("Title: " + newsletter.getTitle());
        System.out.println("Latest Issue: " + newsletter.getLatestIssue());
        System.out.println("Status: " + newsletter.getStatus());
        System.out.println();

        // Release a new issue
        newsletter.setLatestIssue("Issue #2: AI Edition");

        // Change the status (e.g., paused or under review)
        newsletter.setStatus("Temporarily Paused");

        // Remove an observer (Alice unsubscribes)
        newsletter.removeObserver(alice);

        // Change the newsletter title
        newsletter.setTitle("Tech & Trends Weekly");

        // Update status again
        newsletter.setStatus("Active");
    }
}
