package Bridge;

public class BridgeTester {
    public static void main(String[] args){
        RemoteButton theTV1 = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton theTV2 = new TVRemoteMute(new TVDevice(1,200));

        System.out.println("Test TV Muted");

        theTV1.buttonFivePressed();
        theTV1.buttonSixPressed();
        theTV1.buttonNinePressed();

        System.out.println("Test TV with Pause");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
    }



}
