public class Main {
    public static void main(String[] args) {
        //Create a new TextEditor
        TextEditor textEditor = new TextEditor();
        //Create a new EditorApp
        EditorApp editorApp = new EditorApp();
        //Create a new InsertCommand to insert "Hello" at position 0
        Command insertCommand = new InsertCommand(textEditor, 0, "Hello");
        //Execute the command using the EditorApp
        editorApp.executeCommand(insertCommand);

        //Print the current text in the TextEditor
        System.out.println(textEditor.getText()); // This will print "Hello"
    }
}
