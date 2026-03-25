/**
 * OOPS Banner App
 * Refactored to use String.join() for memory efficiency and better performance.
 * * @author Your Name
 * @version 1.2
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
        // UC3: Render OOPS as Banner using String.join()
        // (Refactored from UC2 to avoid '+' operator overhead)
        // ==========================================
        System.out.println("--- UC3: Banner Output (Refactored) ---");

        // The delimiter is an empty string "" to join segments seamlessly.
        // String.join is a static method that handles multiple arguments efficiently.

        // Line 1
        System.out.println(String.join("", "  ***** ", "  ", "  ***** ", "  ", "******* ", "  ", "  ***** "));
        // Line 2
        System.out.println(String.join("", " * * ", "  ", " * * ", "  ", "* * ", "  ", " * * "));
        // Line 3
        System.out.println(String.join("", "* *", "  ", "* *", "  ", "* * ", "  ", "* "));
        // Line 4
        System.out.println(String.join("", "* *", "  ", "* *", "  ", "******* ", "  ", "  ***** "));
        // Line 5
        System.out.println(String.join("", "* *", "  ", "* *", "  ", "* ", "  ", "       * "));
        // Line 6
        System.out.println(String.join("", " * * ", "  ", " * * ", "  ", "* ", "  ", " * * "));
        // Line 7
        System.out.println(String.join("", "  ***** ", "  ", "  ***** ", "  ", "* ", "  ", "  ***** "));
    }
}