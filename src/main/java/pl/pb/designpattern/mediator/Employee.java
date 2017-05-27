package pl.pb.designpattern.mediator;

public interface Employee {

    void sendInformation(String info);

    void receiveInformation(String info);

    Mediator getMediator();

    String getName();
}
