package duke.command;

import duke.task.TaskList;
import duke.util.Storage;
import duke.util.Ui;

/**
 * A class that represents the command when the user types in 'due'.
 */
public class DueCommand extends Command {

    /**
     * Creates a DueCommand, which relies on user inputs to function.
     *
     * @param input A string containing the user's input.
     */
    public DueCommand(String input) {
        super(input);
    }

    /**
     * Displays all tasks due before a certain period, for example all tasks due before
     * the time now, +x hours/days/months.
     *
     * @param taskList   The current list of tasks from the user.
     * @param ui      An object that handles all UI related functionality. (e.g. printing)
     * @param storage An object that handles all save/load related functionality.
     * @return The input task list, unmodified.
     */
    @Override
    public TaskList execute(TaskList taskList, Ui ui, Storage storage) {
        ui.showMessage("Here are the tasks occurring within this time period:");
        ui.showIndentedMessage(taskList.getDueTasks(input).toString());
        return taskList;
    }
}
