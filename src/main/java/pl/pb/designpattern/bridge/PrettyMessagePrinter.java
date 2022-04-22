package pl.pb.designpattern.bridge;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PrettyMessagePrinter implements MessagePrinter {
    public void print(Message message) {
        StringBuilder stringBuilder = new StringBuilder();
        DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:sss");
        stringBuilder.append("[");
        stringBuilder.append(dataFormat.format(message.getTime()));
        stringBuilder.append("] ");
        String type = message.getTypeMessage() == Message.Type.ERROR ? "[31m" : "[32m";
        stringBuilder.append((char) 27);
        stringBuilder.append(type);
        stringBuilder.append(message.getTypeMessage());
        stringBuilder.append((char) 27);
        stringBuilder.append("[0m");
        stringBuilder.append(" : ");
        stringBuilder.append(message.getMessage());

        System.out.println(stringBuilder.toString());
    }
}
