package pl.pb.designpattern.bridge;

import java.util.Date;

public class BridgePattern {

    public static void main(String[] args) {

        SimpleMessagePrinter simpleMessagePrinter = new SimpleMessagePrinter();
        Message simpleMessage1 = new Message(Message.Type.ERROR, "Simple message 1", new Date(), simpleMessagePrinter);
        Message simpleMessage2 = new Message(Message.Type.INFO, "Simple message 1", new Date(), simpleMessagePrinter);

        simpleMessage1.printMessage();
        simpleMessage2.printMessage();

        PrettyMessagePrinter prettyMessagePrinter = new PrettyMessagePrinter();
        Message prettyMessage1 = new Message(Message.Type.ERROR, "Pretty message 1", new Date(), prettyMessagePrinter);
        Message prettyMessage2 = new Message(Message.Type.INFO, "Pretty message 2", new Date(), prettyMessagePrinter);

        prettyMessage1.printMessage();
        prettyMessage2.printMessage();
    }
}
