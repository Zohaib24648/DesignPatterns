public class DocumentContext {
    private DocumentState currentState;
    private String content;

    public DocumentContext() {
        // Start with the DraftState by default
        this.currentState = new DraftState();
        this.content = "";
    }

    // Set a new state (this is how we transition between states)
    public void setState(DocumentState state) {
        this.currentState = state;
    }

    // Provide a getter if needed for the states to read context
    public String getContent() {
        return content;
    }

    // Provide a setter if states need to update the content
    public void setContent(String content) {
        this.content = content;
    }

    // Delegate actions to the current state
    public void edit(String newContent) {
        currentState.edit(this, newContent);
    }

    public void submitForReview() {
        currentState.submitForReview(this);
    }

    public void approve() {
        currentState.approve(this);
    }

    public void reject() {
        currentState.reject(this);
    }
}
