public class Main {
    public static void main(String[] args) {
        //Create a new TextEditor
        TextEditor textEditor = new TextEditor();
        //Create a new EditorApp
        EditorApp editorApp = new EditorApp();
        //Create a new InsertCommand to insert "Hello" at position 0
        Command insertCommand = new InsertCommand(textEditor, 0, "Hello");
        Command insertCommand2 = new InsertCommand(textEditor, 5, " World");
        Command insertCommand3 = new InsertCommand(textEditor, 11, "!");
        
        Command deleteCommand = new DeleteCommand(textEditor, 5, 6);


        //Execute the command using the EditorApp
        editorApp.executeCommand(insertCommand);
        editorApp.executeCommand(insertCommand2);
        editorApp.executeCommand(insertCommand3);



       System.out.println(textEditor.getText());
        //Undo the last command
        editorApp.executeCommand(deleteCommand);
        //Print the current text in the TextEditor
        System.out.println(textEditor.getText());
        
        editorApp.undoLastCommand();
        
        System.out.println(textEditor.getText()); 
    }
}
