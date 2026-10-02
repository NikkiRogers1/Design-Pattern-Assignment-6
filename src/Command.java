public interface Command {
    //Defines the action that every command must be able to perform.
    void execute();
    void undo();
}

