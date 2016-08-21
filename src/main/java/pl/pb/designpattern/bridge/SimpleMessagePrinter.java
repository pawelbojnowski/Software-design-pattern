package pl.pb.designpattern.bridge;

public class SimpleMessagePrinter implements MessagePrinter {
    public void print(Message message) {

        StringBuilder messageToDisplay = new StringBuilder();

        messageToDisplay.append("[");
        messageToDisplay.append(message.getTime());
        messageToDisplay.append("] ");
        messageToDisplay.append(message.getTypeMessage());
        messageToDisplay.append(" : ");
        messageToDisplay.append(message.getMessage());

        System.out.println(messageToDisplay.toString());
    }
}
