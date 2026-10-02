# Journal
Phase 1- The EditorApp is decoupled from the TextEditor class in this setup because the EditorApp doesn't need to know which command it is or how that command works. It would be harder to maintain the app if the app had to call editor.insertText() directly instead of using a Command object because if you were to add a new command like delete, the EditorApp would have to know each new command and how they worked.

Phase 2-
Having the Command object responsible for its own undo logic makes the EditorApp simpler because the EditorApp doesn't need to know how each command is undone. It just needs to know that it has a command and can call its undo method.

Phase 3 -
Using a Stack is the ideal data structure for managing undo operations because the Stack uses LIFO (Last In, First Out), meaning it removes the last command that was inserted first. If I used a Queue, it uses FIFO (First In, First Out), meaning the first command would be removed first. That is the reverse of what we need the undo button to do.

Phase 4 - 
The state captured by InsertCommand is saved so later you can undo the previous command. The state captured by DeleteCommand is saved because if you undo the delete command, the word could be gone and you can't get it back. It is more critical to store the previous state in a delete operation because if you need to undo what you deleted, you need to be able to put that word back.
