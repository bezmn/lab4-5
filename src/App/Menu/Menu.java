package App.Menu;

import App.User.*;
import App.Commands.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private static User user;
    private static Map<String, BaseCommand> userChoose;

    public static void main(String[] args) throws Exception {
        user = new User();
        getMenu();
    }

    public static void getMenu() throws Exception {
        System.out.print("""
                List of all commands:
                \t[1] Show Banks - showbank
                \t[2] Create Credit - createcredit
                \t[3] Delete Credit - deletecredit
                \t[4] Change Credit - changecredit
                \t[5] Show Credits - showcredits
                \t[6] Find Credit - findcredit
                \t[7] Exit - exit
                Input your choose:\s""");
        UserChoose();
    }

    private static void UserChoose() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();

        userChoose = new HashMap<>();

        userChoose.put("showbank", new ShowBanksCommand());
        userChoose.put("createcredit", new CreateCreditCommand());
        userChoose.put("deletecredit", new DeleteCreditCommand());
        userChoose.put("changecredit", new ChangeCreditCommand());
        userChoose.put("showcredit", new ShowCreditCommand());
        userChoose.put("findcredit", new FindCreditCommand());
        userChoose.put("exit", new ExitCommand());

        BaseCommand command = userChoose.get(Input);
        if (command != null) {
            userChoose.get(Input);
        } else {
            throw new IllegalArgumentException("You input incorrect command!");
        }
    }
        /*int tmp = 0;

        BaseCommand[] commands = new BaseCommand[] {
                new ShowBanksCommand(),
                new CreateCreditCommand(),
                new DeleteCreditCommand(),
                new ChangeCreditCommand(),
                new ShowCreditCommand(),
                new FindCreditCommand(),
                new ExitCommand()
        };

        if (Input.contains("showbank")){
            tmp = 1;
        }
        if (Input.contains("createcredit")){
            tmp = 2;
        }
        if (Input.contains("deletecredit")){
            tmp = 3;
        }
        if (Input.contains("changecredit")){
            tmp = 4;
        }
        if (Input.contains("showcredits")){
            tmp = 5;
        }
        if (Input.contains("findcredit")){
            tmp = 6;
        }
        if (Input.contains("exit")){
            tmp = 7;
        }
        else{
            throw new IllegalArgumentException("You input incorrect command!");
        }
        commands[tmp - 1].execute(user);
    }

         */
}
