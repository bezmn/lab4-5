package App.Commands;

import App.User.*;

public interface BaseCommand {
    void execute(User user) throws Exception;
}
