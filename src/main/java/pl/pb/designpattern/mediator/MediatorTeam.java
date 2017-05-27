package pl.pb.designpattern.mediator;


import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class MediatorTeam implements Mediator {
    private List employee;

    public List getEmployee() {
        if (employee == null) {
            employee = new ArrayList();
        }
        return employee;
    }

    public void addEmployee(Employee employee) {
        getEmployee().add(employee);
    }

    public void shearInformation(final String info, Employee employeeAuthor) {
        System.out.println("[MEDIATOR] Author: " + employeeAuthor.getName() + " | messahe: " + info);
        for (Object o : getEmployee()) {
            ((Employee) o).receiveInformation(info);
        }
    }

}
