package pl.pb.designpattern.mediator;


public class Main {

    public static void main(String... arg) {

        MediatorTeam mediatorTeam = new MediatorTeam();
        Employee employee1 = new EmployeeRegular(mediatorTeam, "1");
        Employee employee2 = new EmployeeRegular(mediatorTeam, "2");
        Employee employee3 = new EmployeeRegular(mediatorTeam, "3");
        Employee employee4 = new EmployeeRegular(mediatorTeam, "4");
        Employee employee5 = new EmployeeRegular(mediatorTeam, "5");

        mediatorTeam.addEmployee(employee1);
        mediatorTeam.addEmployee(employee2);
        mediatorTeam.addEmployee(employee3);
        mediatorTeam.addEmployee(employee4);
        mediatorTeam.addEmployee(employee5);

        employee1.sendInformation("New message form boss :)");

    }
}
