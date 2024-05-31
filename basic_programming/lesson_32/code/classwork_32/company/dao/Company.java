package classwork_32.company.dao;

/*  - добавить сотрудника addEmployee
    - удалить сотрудника removeEmployee
    - найти сотрудника findEmployee
    - кол-во сотрудников quantity
    - ФОТ totalSalary
    - средняя з/п averageSalary
    - объем продаж totalSales
    - напечатать список сотрудников printEmployees*/

import classwork_32.company.model.Employee;

public interface Company {

    // define abstract methods
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity(); // quantity of employees
    double totalSalary();
    double avgSalary();
    double totalSales();
    void printEmployee();

    // список сотрудников "стахановцев"
    Employee[] findEmployeeHoursGreaterThen(int hours);

    // список сотрудников с зарплатой от ... до ...
    Employee[]  findEmployeeSalaryRange(double min, double max);

    // new method
    Employee updateEmployee (int id, String secondName);
}
