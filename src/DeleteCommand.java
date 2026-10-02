public class DeleteCommand implements Command {
    //Holds the editor that will actually change the text.
    private TextEditor textEditor;
    //Stores where the text should be deleted.
    private int position;
    //Stores the length of the text that should be deleted.
    private int length;
    //Stores the deleted text for undo functionality.
    private String deletedText;

    //Constructor receives and saves everything needed for the command.
    public DeleteCommand(TextEditor textEditor, int position, int length) {
        this.textEditor = textEditor;
        this.position = position;
        this.length = length;
    }

    //Executes the command by telling the TextEditor to delete the text.
    @Override
    public void execute() {
        //Store the deleted text for undo functionality
        deletedText = textEditor.getText().substring(position, position + length);
        textEditor.deleteText(position, length);
    }

    @Override
    public void undo() {
        textEditor.insertText(position, deletedText);
    }
}