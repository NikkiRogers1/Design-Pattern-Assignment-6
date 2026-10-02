public class TextEditor {
    //Stores the actual text that is being edited
    private StringBuilder text;
    //Constructor creates a new TextEEditor with an empty text
    public TextEditor() {
        this.text = new StringBuilder();
    }
    //Inserts the new text at the position given.
    public void insertText(int position, String newText) {
        text.insert(position, newText);
    }
    //Returns the current text in the editor as a String
    public String getText() {
        return text.toString();
    }
    //Deletes the text starting at the position given and continuing for the length given.
    public void deleteText(int position, int length) {
        text.delete(position, position + length);
    }
}

  