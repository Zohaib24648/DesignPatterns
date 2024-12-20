public class ApprovedState implements DocumentState {

    @Override
    public void edit(DocumentContext context, String content) {
        System.out.println("Document is Approved. Editing is not allowed anymore.");
    }

    @Override
    public void submitForReview(DocumentContext context) {
        System.out.println("Document is already approved. No further review necessary.");
    }

    @Override
    public void approve(DocumentContext context) {
        System.out.println("Document is already approved. No action taken.");
    }

    @Override
    public void reject(DocumentContext context) {
        System.out.println("Cannot reject an approved document. This action is invalid.");
    }
}
