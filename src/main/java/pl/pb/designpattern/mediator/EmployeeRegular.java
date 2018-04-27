package pl.pb.designpattern.mediator;


public class EmployeeRegular implements Employee {

    private Mediator mediator;
    private String name;

    public EmployeeRegular(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addEmployee(this);
    }


    public void sendInformation(String info) {
        getMediator().shearInformation(info, this);
    }

    public void receiveInformation(String info) {
        System.out.println("[EMPLOYEE] receive: " + getName() + " | " + info);
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
