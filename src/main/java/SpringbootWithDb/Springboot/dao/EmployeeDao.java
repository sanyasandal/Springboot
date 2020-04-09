package SpringbootWithDb.Springboot.dao;


import SpringbootWithDb.Springboot.model.Employee;

import java.util.List;

public interface EmployeeDao {

   List<Employee> get();
   Employee get(int id);
   void save(Employee employee);
   void delete(int id);
}
