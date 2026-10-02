public class InsertCommand implements Command {
    //Holds the editor that will actually change the text.
    private TextEditor textEditor;
    //Stores where the text should be inserted.
    private int position;
    //Stores the text that should be inserted.
    private String newText;
    
//Constructor recieves and saves everything needed for the command.
    public InsertCommand(TextEditor textEditor, int position, String newText) {
        this.textEditor = textEditor;
        this.position = position;
        this.newText = newText;
    }
//Executes the command by telling the TextEditor to insert the text.
    @Override
    public void execute() {
        textEditor.insertText(position, newText);
    }

}
