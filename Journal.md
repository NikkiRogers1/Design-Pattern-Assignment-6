# Journal
Phase 1- The EditorApp is decoupled from the TextEditor class in this setup because the EditorApp doesn't need to know which command it is or how that command works. It would be harder to maintain the app if the app had to call editor.insertText() directly instead of using a Command object because if you were to add a new command like delete, the EditorApp would have to know each new command and how they worked.

Phase 2-
Having the Command object responsible for its own undo logic makes the EditorApp simpler because the EditorApp doesn't need to know how each command is undone. It just needs to know that it has a command and can call its undo method.
