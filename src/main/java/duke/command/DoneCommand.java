package duke.command;

import duke.task.TaskList;

import duke.util.Ui;
import duke.util.Storage;

import java.io.IOException;

public class DoneCommand extends Command {
    public DoneCommand(String input) {
        super(input);
    }

    @Override
    public TaskList execute(TaskList tasks, Ui ui, Storage storage) throws IOException {
        TaskList newTasks = tasks.markTask(input, ui);
        storage.saveTasksToFile(newTasks);
        return newTasks;
    }
}
