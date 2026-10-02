public class EditorApp {
    private Command lastCommand;
    //Executes whatever command is given to the EditorApp
 public void executeCommand(Command command) {
    //Tells the command to perform its action.
        command.execute();
        lastCommand = command; // Store the executed command
    }
public void undoLastCommand() {
        if (lastCommand != null) {
            lastCommand.undo();
            lastCommand = null; // Clear the last command after undoing
        }
    }
}
