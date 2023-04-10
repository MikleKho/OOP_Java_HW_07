package terminal.displayed;

import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.NoneCommandExecutable;
public class DeleteStudentDisplayed implements ResultDisplayed {
    private final CommandExecutable commandExecutable;
    public DeleteStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }
    @Override
    public void display() {
        if (commandExecutable instanceof NoneCommandExecutable) {
            System.out.println("Input error. Запись не удалена\n");
        } else {
            System.out.println("Well done. Запись успешно удалена\n");
        }
    }
}
