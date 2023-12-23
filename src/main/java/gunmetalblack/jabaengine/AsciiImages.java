package gunmetalblack.jabaengine;

import java.util.HashMap;
import java.util.Map;

public class AsciiImages {
    static Map<String,String> images = new HashMap<String,String>();

    static
    {
        //text
        //ui
        //art
        images.put("text_start", "      ___      ___          ___          ___      ___     \n" +
                "     /\\  \\    /\\  \\        /\\  \\        /\\  \\    /\\  \\    \n" +
                "    /::\\  \\   \\:\\  \\      /::\\  \\      /::\\  \\   \\:\\  \\   \n" +
                "   /:/\\ \\  \\   \\:\\  \\    /:/\\:\\  \\    /:/\\:\\  \\   \\:\\  \\  \n" +
                "  _\\:\\~\\ \\  \\  /::\\  \\  /::\\~\\:\\  \\  /::\\~\\:\\  \\  /::\\  \\ \n" +
                " /\\ \\:\\ \\ \\__\\/:/\\:\\__\\/:/\\:\\ \\:\\__\\/:/\\:\\ \\:\\__\\/:/\\:\\__\\\n" +
                " \\:\\ \\:\\ \\/__/:/  \\/__/\\/__\\:\\/:/  /\\/_|::\\/:/  /:/  \\/__/\n" +
                "  \\:\\ \\:\\__\\/:/  /          \\::/  /    |:|::/  /:/  /     \n" +
                "   \\:\\/:/  /\\/__/           /:/  /     |:|\\/__/\\/__/      \n" +
                "    \\::/  /                /:/  /      |:|  |             \n" +
                "     \\/__/                 \\/__/        \\|__|             ");
    }

    public static String getAsciiImage(String ID)
    {
        try
        {
            return images.get(ID);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
