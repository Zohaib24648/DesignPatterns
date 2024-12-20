public interface DocumentState {
    void edit(DocumentContext context, String content);
    void submitForReview(DocumentContext context);
    void approve(DocumentContext context);
    void reject(DocumentContext context);
}
