import java.util.Stack;

public class EditorApp {
    private Stack<Command> commandStack;

    public EditorApp() {
        this.commandStack = new Stack<>();
    }

    //Executes whatever command is given to the EditorApp
 public void executeCommand(Command command) {
    //Tells the command to perform its action.
        command.execute();
        commandStack.push(command); // Push the executed command onto the stack
    }
public void undoLastCommand() {
        if (!commandStack.isEmpty()) {
            Command command = commandStack.pop();
            command.undo();
        }
    }
}
