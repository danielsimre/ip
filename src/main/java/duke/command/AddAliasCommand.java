package duke.command;

import java.io.IOException;

import javafx.util.Pair;

import duke.result.AliasHandler;
import duke.result.Result;
import duke.result.TaskList;
import duke.util.Parser;
import duke.util.Storage;
import duke.util.Ui;

/**
 * A class that represents the command when the user types in 'addalias'.
 */
public class AddAliasCommand extends Command {

    /**
     * Creates an AddAliasCommand, which relies on user inputs to function.
     *
     * @param input A string containing the user's input.
     */
    public AddAliasCommand(String input) {
        super(input);
    }

    /**
     * Adds an alias and saves the new alias to the config file.
     *
     * @param taskList   The current list of tasks from the user.
     * @param ui      An object that handles all UI related functionality. (e.g. printing)
     * @param storage An object that handles all save/load related functionality.
     * @return A Result object containing task and alias data, as well as an output message.
     * @throws IOException If an error occurs during the save operation.
     */
    @Override
    public Result execute(TaskList taskList, Ui ui, Storage storage) throws IOException {
        AliasHandler aliasHandler = Parser.getAliasHandler();
        // This pair contains the updated AliasHandler along with an output message
        Pair<AliasHandler, String> aliasHandlerPair = aliasHandler.addAlias(ui, input);
        AliasHandler newAliasHandler = aliasHandlerPair.getKey();
        storage.saveAliasesToFile(newAliasHandler);
        String message = aliasHandlerPair.getValue();
        return new Result(taskList, newAliasHandler, message);
    }
}
