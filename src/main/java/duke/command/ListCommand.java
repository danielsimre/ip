package duke.command;

import duke.result.Result;
import duke.result.TaskList;
import duke.util.Storage;
import duke.util.Ui;

/**
 * A class that represents the command when the user types in 'list'.
 */
public class ListCommand extends Command {

    /**
     * Displays all tasks in the user's task list.
     *
     * @param taskList   The current list of tasks from the user.
     * @param ui      An object that handles all UI related functionality. (e.g. printing)
     * @param storage An object that handles all save/load related functionality.
     * @return A Result object containing task and alias data, as well as an output message.
     */
    @Override
    public Result execute(TaskList taskList, Ui ui, Storage storage) {
        String message = ui.showMessage("Here is your task list:")
                + ui.showMessage(taskList.toString());
        return new Result(taskList, message);
    }
}
