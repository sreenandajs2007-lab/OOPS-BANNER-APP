/**
 * OOPS Banner App
 * UC4: Refactored to use a String Array and an Enhanced For-Loop
 * to eliminate repetitive print statements.
 * * @author Your Name
 * @version 1.3
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
        // UC4: Render OOPS as Banner using String Array and Loop
        // (Refactored from UC3 to remove repetitive print calls)
        // ==========================================
        System.out.println("--- UC4: Banner Output (Array & Loop) ---");

        // 1. Array Creation & Population
        // We create a String array of size 7 to hold each line of the banner.
        String[] bannerLines = new String[7];

        // 2. Populate the array using String.join() as established in UC3
        bannerLines[0] = String.join("", "  ***** ", "  ", "  ***** ", "  ", "******* ", "  ", "  ***** ");
        bannerLines[1] = String.join("", " * * ", "  ", " * * ", "  ", "* * ", "  ", " * * ");
        bannerLines[2] = String.join("", "* *", "  ", "* *", "  ", "* * ", "  ", "* ");
        bannerLines[3] = String.join("", "* *", "  ", "* *", "  ", "******* ", "  ", "  ***** ");
        bannerLines[4] = String.join("", "* *", "  ", "* *", "  ", "* ", "  ", "       *");
        bannerLines[5] = String.join("", " * * ", "  ", " * * ", "  ", "* ", "  ", " * * ");
        bannerLines[6] = String.join("", "  ***** ", "  ", "  ***** ", "  ", "* ", "  ", "  ***** ");

        // 3. Enhanced For-Loop (Loop Iteration)
        // Instead of 7 print statements, we use one loop to traverse the array.
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}