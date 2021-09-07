package duke.command;

import duke.task.TaskList;
import duke.util.Storage;
import duke.util.Ui;

/**
 * A class that represents the command when the user types in 'ondate'.
 */
public class OnDateCommand extends Command {

    /**
     * Creates an OnDateCommand, which relies on user inputs to function.
     *
     * @param input A string containing the user's input.
     */
    public OnDateCommand(String input) {
        super(input);
    }

    /**
     * Displays all tasks due on a specific date.
     *
     * @param taskList   The current list of tasks from the user.
     * @param ui      An object that handles all UI related functionality. (e.g. printing)
     * @param storage An object that handles all save/load related functionality.
     * @return The input task list with an output message.
     */
    @Override
    public TaskList execute(TaskList taskList, Ui ui, Storage storage) {
        TaskList onDateTaskList = taskList.getOnDateTasks(input);
        String message = ui.showMessage("Here are the tasks occurring on this date:")
                + ui.showMessage(onDateTaskList.toString());
        return new TaskList(taskList, message);
    }
}
