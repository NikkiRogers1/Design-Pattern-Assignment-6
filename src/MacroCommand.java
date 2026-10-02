import java.util.ArrayList;
public class MacroCommand implements Command {
//Stores all of the commands that belong to the macro.    
private ArrayList<Command> commands;
// Creates the Arraylist that will hold the commands.
    public MacroCommand() {
        this.commands = new ArrayList<>();
    }

//Adds a command to the macro.
    public void addCommand(Command command) {
        commands.add(command);
    }
//Executes all commands in the order they were added.
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    //Undoes all commands in reverse order.
    @Override
    public void undo() {
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
   
    
}
