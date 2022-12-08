package ru.mirea.task31;

import ru.mirea.task17.Employee;
import ru.mirea.task17.EmployeeController;
import ru.mirea.task17.EmployeeView;

public class MVCPatternDemo_test {

    public static void main(String[] args)
    {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeCost_per_one_hour(6);
        controller.setEmployeeSalary_per_month();
        System.out.println("After updating, Employee Details are as follows");
        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase()
    {
        Employee employee = new Employee();
        employee.setCost_per_one_hour(3);
        employee.setHours_number(2);
        employee.setDays_number(4);
        employee.setSalary_per_month();
        return employee;
    }
}
