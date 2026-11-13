package net.altoncook.measurelib.test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Utils {
    public static final boolean PRINT = true;
    private static final String RESET_ANSI = "\u001B[0m";
    private static final String GREEN_ANSI = "\u001B[32m";
    private static final String RED_ANSI = "\u001B[31m";
    private static final String CYAN_ANSI = "\u001B[36m";
    private static final String BOLD_ANSI = "\u001B[1m";

    public static void registerTestEquals(Object a, Object b) {
        if (PRINT) {
            if (Objects.equals(a, b)) {
                System.out.printf("%s[PASS]%s %sTest: [%s%s%s], Actual: [%s%s%s]%n", GREEN_ANSI + BOLD_ANSI, RESET_ANSI, CYAN_ANSI, RESET_ANSI, a, CYAN_ANSI, RESET_ANSI, b, CYAN_ANSI);
            } else {
                System.out.printf("%s[FAIL]%s %sTest: [%s%s%s], Actual: [%s%s%s]%n", RED_ANSI + BOLD_ANSI, RESET_ANSI, CYAN_ANSI, RESET_ANSI, a, CYAN_ANSI, RESET_ANSI, b, CYAN_ANSI);
            }
        }
        assertEquals(a, b);
    }

    public static void space() {
        if (PRINT) System.out.println();
    }

    private Utils() {}
}