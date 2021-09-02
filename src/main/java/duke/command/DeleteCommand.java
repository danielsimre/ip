package duke.command;

import java.io.IOException;

import duke.task.TaskList;
import duke.util.Storage;
import duke.util.Ui;

/**
 * A class that represents the command when the user types in 'delete'.
 */
public class DeleteCommand extends Command {

    /**
     * Creates a DeleteCommand, which relies on user inputs to function.
     *
     * @param input A string containing the user's input.
     */
    public DeleteCommand(String input) {
        super(input);
    }

    /**
     * Deletes a task from the task list and saves the new task list to the save file.
     *
     * @param taskList   The current list of tasks from the user.
     * @param ui      An object that handles all UI related functionality. (e.g. printing)
     * @param storage An object that handles all save/load related functionality.
     * @return A task list with the specified task removed.
     * @throws IOException If an error occurs during the save operation.
     */
    @Override
    public TaskList execute(TaskList taskList, Ui ui, Storage storage) throws IOException {
        TaskList newTaskList = taskList.deleteTask(input, ui);
        storage.saveTasksToFile(newTaskList);
        return newTaskList;
    }
}
