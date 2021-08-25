import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
    private String taskName;
    private boolean isDone;

    public Task(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public boolean hasSameDate(LocalDate date) {
        return false;
    }

    public boolean isBeforeDate(LocalDateTime dateTime) {
        return false;
    }

    @Override
    public String toString() {
        String statusString = this.isDone ? "X" : " ";
        return String.format("[%s] %s", statusString, this.taskName);
    }
}
