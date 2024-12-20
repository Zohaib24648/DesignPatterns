public class ReviewState implements DocumentState {

    @Override
    public void edit(DocumentContext context, String content) {
        System.out.println("Document is in Review. Editing not allowed by the author now.");
    }

    @Override
    public void submitForReview(DocumentContext context) {
        System.out.println("Document is already in review. Cannot submit again.");
    }

    @Override
    public void approve(DocumentContext context) {
        System.out.println("Review complete. Document approved.");
        // Transition to ApprovedState
        context.setState(new ApprovedState());
    }

    @Override
    public void reject(DocumentContext context) {
        System.out.println("Document rejected. Sending back to Draft for rework.");
        // Transition back to DraftState
        context.setState(new DraftState());
    }
}
