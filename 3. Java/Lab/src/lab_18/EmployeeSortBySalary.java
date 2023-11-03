
package lab_18;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
    
}
