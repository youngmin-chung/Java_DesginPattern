package Command;

public class DeviceButton {
    Command theCommand;
    public DeviceButton(Command newCommand){
        theCommand = newCommand;
    }

    public void press(){
        theCommand.execute();
    }

    // Now the remote can undo past commands
    public void pressUndo(){
        theCommand.undo();
    }
}
