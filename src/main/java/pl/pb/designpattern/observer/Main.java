package pl.pb.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        MessageSubscriber s1 = new MessageSubscriber("MessageSubscriber One");
        MessageSubscriber s2 = new MessageSubscriber("MessageSubscriber Two");
        MessageSubscriber s3 = new MessageSubscriber("MessageSubscriber Tree");

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
