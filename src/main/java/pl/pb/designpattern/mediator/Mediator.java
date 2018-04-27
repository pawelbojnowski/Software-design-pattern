package pl.pb.designpattern.mediator;


public interface Mediator {
    void shearInformation(String info, Employee employeeAuthor);

    void addEmployee(Employee employee);
}
