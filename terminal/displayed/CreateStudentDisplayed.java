package terminal.displayed;

import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.NoneCommandExecutable;
public class CreateStudentDisplayed implements ResultDisplayed {
    private final CommandExecutable commandExecutable;
    public CreateStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }
    @Override
    public void display() {
        if (commandExecutable instanceof NoneCommandExecutable) {
            System.out.println("Input error. Запись не создана\n");
        } else {
            System.out.println("Well done. Запись успешно создана\n");
        }
    }
}
