package gunmetalblack.jabaengine;

//Goals
//Render
//Objects
//Player movement
//NPC
//Card Game Vomit
//Screen Clipping

//---- Renderer --- Menu -- > x,p -> chars color extend - object

public class Main {

    public static void main(String[] args)
    {
        Render.clear();
        MenuOption[] startMenuOptions = {new MenuOption("Start",() -> Logger.log("Starting")), new MenuOption("Back",() -> Logger.log("Backing"))};
        UI startMenu = new UI(startMenuOptions);
        startMenu.InputUI();
    }
}