package gunmetalblack.jabaengine;

public class UI implements Renderable{
    MenuOption[] optionsList;
    int indexSelection = 0;
    public UI(MenuOption[] menuOptions)
    {
        optionsList = menuOptions;
    }

    // W or A loops up and down the list enter black for selection
    public void InputUI()
    {
        while(true) {
            String optionInput = Input.pressed();
            if (optionInput.equals("w")) {
                indexSelection++;
                if (((indexSelection) + 1 > optionsList.length)) {
                    indexSelection = 0;
                }
            } else if (optionInput.equals("s")) {
                indexSelection--;
                if (indexSelection < 0) {
                    indexSelection = optionsList.length - 1;
                }
            } else if (optionInput.trim().isEmpty()) {
                Logger.log("SELECTED" + String.valueOf(indexSelection));
                selection(indexSelection);
                break;
            }
            Logger.log(String.valueOf((indexSelection)));
            Logger.log("OPTION: "+ String.valueOf((optionsList.length)));
            render();
        }
    }

    @Override
    public void render()
    {
        for(int i = 0; i < optionsList.length; i++)
        {
            if(indexSelection == i)
            {
                System.out.println(Colors.bgYellow + optionsList[i].name + Colors.reset);
            }
            else
            {
                System.out.println(optionsList[i].name);
            }
        }
    }
    public void selection(int selection)
    {
        optionsList[selection].action.run();
    }
}
