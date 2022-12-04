package ru.mirea.task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeDays_number(float days_number) {
        model.setDays_number(days_number);
    }


    public void setEmployeeSalary_per_month() {
        model.setSalary_per_month();
    }

    public double getEmployeeSalary_per_month() {
        return model.getSalary_per_month();
    }


    public void setEmployeeCost_per_one_hour(float cost_per_one_hour) {
        model.setCost_per_one_hour(cost_per_one_hour);
    }

    public void setEmployeeHours_number(float hours_number) {
        model.setHours_number(hours_number);
    }

    public double getEmployeeCost_per_one_hour() {
        return model.getCost_per_one_hour();
    }

    public double getEmployeeDays_number() {
        return model.getDays_number();
    }

    public double getEmployeeHours_number() {
        return model.getHours_number();
    }

    public void updateView()
    {
        view.printEmployeeDetails(model.getCost_per_one_hour(),
                model.getHours_number(), model.getDays_number(), model.getSalary_per_month());
    }
}
