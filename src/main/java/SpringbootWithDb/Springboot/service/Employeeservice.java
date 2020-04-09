package SpringbootWithDb.Springboot.service;

import SpringbootWithDb.Springboot.model.Employee;

import java.util.List;

public interface Employeeservice {

    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);
}
