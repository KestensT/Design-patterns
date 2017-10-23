public class Client {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        TV tv = new TV();

        Command tvOn = new TvOnCommand(tv);
        Command tvOff = new TvOffCommand(tv);


        control.setCommand(tvOn);
        control.pressButton();


        control.setCommand(tvOff);
        control.pressButton();
    }
}


// client = degene die de remote gebruikt.
// invoker = remote control.
// receiver = tv.