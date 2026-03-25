/**
 * OOPS Banner App
 * UC6: Refactored to use Static Helper Methods for Modularization and Reusability.
 * This version uses the DRY principle by defining letter patterns in methods.
 * * @author Your Name
 * @version 1.5
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
        // UC6: Render OOPS as Banner using Functions (Refactored)
        // ==========================================
        System.out.println("--- UC6: Banner Output (Modular Functions) ---");

        // Array Initialization calling our helper methods
        // Notice getOPattern() is called twice - Reusability in action!
        String[] bannerLines = {
                String.join("  ", getOPattern(0), getOPattern(0), getPPattern(0), getSPattern(0)),
                String.join("  ", getOPattern(1), getOPattern(1), getPPattern(1), getSPattern(1)),
                String.join("  ", getOPattern(2), getOPattern(2), getPPattern(2), getSPattern(2)),
                String.join("  ", getOPattern(3), getOPattern(3), getPPattern(3), getSPattern(3)),
                String.join("  ", getOPattern(4), getOPattern(4), getPPattern(4), getSPattern(4)),
                String.join("  ", getOPattern(5), getOPattern(5), getPPattern(5), getSPattern(5)),
                String.join("  ", getOPattern(6), getOPattern(6), getPPattern(6), getSPattern(6))
        };

        // Loop-Based Rendering
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // ==========================================
    // Helper Methods (Static Methods)
    // ==========================================

    /**
     * Returns the specific line for the letter 'O'
     */
    public static String getOPattern(int line) {
        String[] o = {
                "  ***** ",
                " * * ",
                "* *",
                "* *",
                "* *",
                " * * ",
                "  ***** "
        };
        return o[line];
    }

    /**
     * Returns the specific line for the letter 'P'
     */
    public static String getPPattern(int line) {
        String[] p = {
                "******* ",
                "* * ",
                "* * ",
                "******* ",
                "* ",
                "* ",
                "* "
        };
        return p[line];
    }

    /**
     * Returns the specific line for the letter 'S'
     */
    public static String getSPattern(int line) {
        String[] s = {
                "  ***** ",
                " * * ",
                "* ",
                "  ***** ",
                "       * ",
                " * * ",
                "  ***** "
        };
        return s[line];
    }
}