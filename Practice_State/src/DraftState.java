public class DraftState implements DocumentState {

    @Override
    public void edit(DocumentContext context, String content) {
        System.out.println("Document is in Draft. Editing is allowed.");
        context.setContent(content);
        System.out.println("Document content updated to: " + context.getContent());
    }

    @Override
    public void submitForReview(DocumentContext context) {
        System.out.println("Submitting the document for review.");
        // Transition to ReviewState
        context.setState(new ReviewState());
    }

    @Override
    public void approve(DocumentContext context) {
        System.out.println("Cannot approve a document in Draft state. Submit for review first.");
    }

    @Override
    public void reject(DocumentContext context) {
        System.out.println("Cannot reject a document in Draft state. Submit for review first.");
    }
}
