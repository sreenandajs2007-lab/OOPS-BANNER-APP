import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - Final Evolution
 * UC8: Utilizing HashMap for efficient pattern management and rendering.
 * * @author Your Name
 * @version 1.8
 */
public class OOPSBannerApp {

    // ==========================================
    // PART 1: MAIN CLASS & DATA STRUCTURE
    // ==========================================
    // A Map to store character patterns for centralized management
    private static final Map<Character, String[]> bannerMap = new HashMap<>();

    static {
        // Static initializer block to populate the map when the class loads
        bannerMap.put('O', getOPattern());
        bannerMap.put('P', getPPattern());
        bannerMap.put('S', getSPattern());
    }

    // ==========================================
    // PART 3: MAIN METHOD
    // ==========================================
    public static void main(String[] args) {

        // --- UC1: Simple Output ---
        System.out.println("OOPS");
        System.out.println();

        // --- UC8: Map-Based Banner Output ---
        System.out.println("--- UC8: Banner Output (HashMap & Modular Function) ---");

        // We can now print any word that exists in our map!
        displayBanner("OOPS");
    }

    // ==========================================
    // PART 2: UTILITY STATIC METHODS
    // ==========================================

    /**
     * Renders the provided string as a banner using nested loops.
     * @param message The word to display (e.g., "OOPS")
     */
    public static void displayBanner(String message) {
        // Outer loop for each of the 7 lines of the banner
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            // Inner loop to iterate through each character in the message
            for (char c : message.toUpperCase().toCharArray()) {
                if (bannerMap.containsKey(c)) {
                    lineBuilder.append(bannerMap.get(c)[i]).append("  ");
                }
            }
            System.out.println(lineBuilder.toString());
        }
    }

    /** @return 7-line pattern for 'O' */
    public static String[] getOPattern() {
        return new String[] { "  ***** ", " * * ", "* *", "* *", "* *", " * * ", "  ***** " };
    }

    /** @return 7-line pattern for 'P' */
    public static String[] getPPattern() {
        return new String[] { "******* ", "* * ", "* * ", "******* ", "* ", "* ", "* " };
    }

    /** @return 7-line pattern for 'S' */
    public static String[] getSPattern() {
        return new String[] { "  ***** ", " * * ", "* ", "  ***** ", "       *", " * * ", "  ***** " };
    }
}