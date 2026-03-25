/**
 * OOPS Banner App
 * Goal: Evolve from simple console output to an Object-Oriented
 * architecture using Inner Classes and Encapsulation.
 * * @author Your Name
 * @version 1.7
 */
public class OOPSBannerApp {

    // ==========================================
    // PART 2: INNER STATIC CLASS
    // ==========================================
    /**
     * CharacterPatternMap encapsulates a character and its banner representation.
     * Principle: ENCAPSULATION & SINGLE RESPONSIBILITY
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize the object state.
         * @param character The character to represent
         * @param pattern Array of 7 strings forming the banner
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for the character.
         * @return char
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for a specific line of the pattern.
         * @param line Index of the row (0-6)
         * @return String representing one row of the banner
         */
        public String getPatternLine(int line) {
            return pattern[line];
        }
    }

    // ==========================================
    // PART 4: MAIN METHOD (ENTRY POINT)
    // ==========================================
    public static void main(String[] args) {

        // --- UC1: Simple Output ---
        System.out.println("OOPS");
        System.out.println();

        // --- UC7: Object-Oriented Banner Output ---
        // 1. Instantiate objects for each character pattern
        CharacterPatternMap oChar = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap pChar = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap sChar = new CharacterPatternMap('S', getSPattern());

        // 2. Create an array of objects to define the word "OOPS"
        // Principle: ARRAYS OF OBJECTS
        CharacterPatternMap[] bannerObjects = { oChar, oChar, pChar, sChar };

        // 3. Render the banner using StringBuilder for efficiency
        // Principle: MODULARITY & SEPARATION OF CONCERNS
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap cp : bannerObjects) {
                lineBuilder.append(cp.getPatternLine(i)).append("  ");
            }
            System.out.println(lineBuilder.toString());
        }
    }

    // ==========================================
    // PART 3: UTILITY STATIC METHODS
    // ==========================================

    /**
     * @return 7-line pattern for 'O'
     */
    public static String[] getOPattern() {
        return new String[] {
                "  ***** ",
                " * * ",
                "* *",
                "* *",
                "* *",
                " * * ",
                "  ***** "
        };
    }

    /**
     * @return 7-line pattern for 'P'
     */
    public static String[] getPPattern() {
        return new String[] {
                "******* ",
                "* * ",
                "* * ",
                "******* ",
                "* ",
                "* ",
                "* "
        };
    }

    /**
     * @return 7-line pattern for 'S'
     */
    public static String[] getSPattern() {
        return new String[] {
                "  ***** ",
                " * * ",
                " * ",
                "  ***** ",
                "       * ",
                " * * ",
                "  ***** "
        };
    }
}
