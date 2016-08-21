package pl.pb.designpattern.bridge;

import java.util.Date;

public class Message {
    public enum Type {INFO, ERROR}

    private MessagePrinter messagePrinter;

    private Type typeMessage;
    private String message;
    private Date time;

    public Message(Type typeMessage, String message, Date time, MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
        this.typeMessage = typeMessage;
        this.message = message;
        this.time = time;
    }

    public void printMessage() {
        messagePrinter.print(this);
    }

    public Type getTypeMessage() {
        return typeMessage;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }
}
