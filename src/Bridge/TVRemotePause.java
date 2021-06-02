package Bridge;

/* Refined Abstraction
*  If I decide I want to further extend the remote I can
* */

public class TVRemotePause extends RemoteButton{
    public TVRemotePause(EntertainmentDevice newDevice){
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }


}
