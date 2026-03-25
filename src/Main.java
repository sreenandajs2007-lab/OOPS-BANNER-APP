/**
 * OOPS Banner App
 * UC5: Refactored to use Inline Array Initialization for conciseness.
 * Combining declaration, initialization, and String.join() in one statement.
 * * @author Your Name
 * @version 1.4
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // ==========================================
        // UC1: Print OOPS to Console
        // ==========================================
        System.out.println("--- UC1: Simple Output ---");
        System.out.println("OOPS");

        System.out.println("\n");

        // ==========================================
        // UC5: Render OOPS as Banner using Inline Array Initialization
        // (Refactored from UC4 to be more concise and readable)
        // ==========================================
        System.out.println("--- UC5: Banner Output (Inline Initialization) ---");

        // Using {} braces to initialize the array and populate it immediately.
        // Each element calls String.join() to build the specific line.
        String[] bannerLines = {
                String.join("", "  ***** ", "  ", "  ***** ", "  ", "******* ", "  ", "  ***** "),
                String.join("", " * * ", "  ", " * * ", "  ", "* * ", "  ", " * * "),
                String.join("", "* *", "  ", "* *", "  ", "* * ", "  ", "* "),
                String.join("", "* *", "  ", "* *", "  ", "******* ", "  ", "  ***** "),
                String.join("", "* *", "  ", "* *", "  ", "* ", "  ", "       * "),
                String.join("", " * * ", "  ", " * * ", "  ", "* ", "  ", " * * "),
                String.join("", "  ***** ", "  ", "  ***** ", "  ", "* ", "  ", "  ***** ")
        };

        // Enhanced For-Loop to iterate through the cleanly initialized array
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}