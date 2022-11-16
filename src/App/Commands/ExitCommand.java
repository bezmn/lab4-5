package App.Commands;

import App.Commands.BaseCommand;
import App.User.User;
public class ExitCommand implements BaseCommand {
    public void execute(User user) {
        System.exit(0);
    }
}