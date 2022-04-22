package pl.pb.designpattern.observer;

public class MessageSubscriber implements Observer {

    final private String subscriberName;

    public MessageSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(Message m) {
        System.out.println(subscriberName + " :: " + m.getMessageContent());
    }
}