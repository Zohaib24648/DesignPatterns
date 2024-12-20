public class Main {
    public static void main(String[] args) {
        DocumentContext doc = new DocumentContext();

        System.out.println("DOCUMENT IN DRAFT");
        doc.edit("First draft content");
        doc.submitForReview();

        System.out.println("\nDOCUMENT IN REVIEW");
        // Attempt to edit in Review
        doc.edit("Trying to edit while in review (should fail)");
        // Approve the document
        doc.approve();

        System.out.println("\nDOCUMENT IS APPROVED");
        // Now document is approved, further attempts to change or reject are restricted
        doc.edit("Attempting to edit after approval (should fail)");
        doc.reject(); // should fail
    }
}
