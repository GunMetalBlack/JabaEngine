package gunmetalblack.jabaengine;

public class MenuOption {
    String name;
    Runnable action;
    public MenuOption(String options, Runnable func )
    {
        name = options;
        action = func;
    }
}
