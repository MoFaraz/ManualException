import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static Scanner scanner = new Scanner(System.in);

    @Test
    void shouldEqualsMohammad(){
        assertEquals("Invalid Name, it should be Mohammad" , Main.temp());
    }
}