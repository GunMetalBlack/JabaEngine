package gunmetalblack.jabaengine;

import java.awt.*;

public class Render {
    //draw character to the screen
    public static void printToScreenPosition(String toPrint,int row, int column)
    {
        char escCode = 0x1B;
        // ANSI escape code to position the cursor
        System.out.print(String.format("%c[%d;%df", escCode, row, column));
        // Print "wow" in yellow at (3, 5)
        System.out.print(toPrint + Colors.reset);
    }
    public static void printToScreenPositionNl(String toPrint,int row, int column)
    {
        printToScreenPosition(toPrint,row,column);
        System.out.println();
    }

    //draw image to the screen

    //Extract character at position in array
    // Spacing between words

    //clear Screen
    public static void clear()
    {
        System.out.println("\033[H\033[2J");
    }

}
