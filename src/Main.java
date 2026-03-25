/**
 * OOPS Banner App
 * Goal: Display the literal text "OOPS" to the console and extend it to print
 * "OOPS" as an ASCII banner using string concatenation and print statements.
 * * @author Your Name
 * @version 1.1
 */
public class OOPSBannerApp {

    /**
     * Main Method - Entry point of the Java application.
     * * @param args Command line arguments
     */
    public static void main(String[] args) {

        // ==========================================
        // UC1: Print OOPS to Console
        // ==========================================
        System.out.println("--- UC1: Simple Output ---");
        System.out.println("OOPS");

        System.out.println("\n"); // Blank lines for better readability

        // ==========================================
        // UC2: Render OOPS as Banner using Print Statements
        // ==========================================
        System.out.println("--- UC2: Banner Output ---");

        // Each letter string is exactly 9 characters wide.
        // We use the '+' operator to concatenate the strings for O, O, P, and S.
        // A 2-space string ("  ") is used as a divider between each letter.

        // Line 1
        System.out.println("  ***** " + "  " + "  ***** " + "  " + "******* " + "  " + "  ***** ");
        // Line 2
        System.out.println(" * * " + "  " + " * * " + "  " + "* * " + "  " + " * * ");
        // Line 3
        System.out.println("* *" + "  " + "* *" + "  " + "* * " + "  " + "* ");
        // Line 4
        System.out.println("* *" + "  " + "* *" + "  " + "******* " + "  " + "  ***** ");
        // Line 5
        System.out.println("* *" + "  " + "* *" + "  " + "* " + "  " + "       * ");
        // Line 6
        System.out.println(" * * " + "  " + " * * " + "  " + "* " + "  " + " * * ");
        // Line 7
        System.out.println("  ***** " + "  " + "  ***** " + "  " + "* " + "  " + "  ***** ");

    }
}