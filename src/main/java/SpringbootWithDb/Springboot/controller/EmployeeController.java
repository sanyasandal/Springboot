package SpringbootWithDb.Springboot.controller;

import SpringbootWithDb.Springboot.model.Employee;
import SpringbootWithDb.Springboot.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

        @Autowired
        private Employeeservice employeeservice;

        @GetMapping("/employee")
        public List<Employee> get(){
           return employeeservice.get();
        }

        @PostMapping("/employee")
        public Employee save(@RequestBody Employee employeeObj){
                employeeservice.save(employeeObj);
                return employeeObj;
        }

        @GetMapping("/employee/{id}")
        public Employee get(@PathVariable int id){
               Employee employeeObj  = employeeservice.get(id);
                if (employeeObj == null) {

                        throw new RuntimeException("Employee with id: "+id+" is not found");
                }

                return employeeObj;

        }
        @DeleteMapping("/employee/{id}")
        public String delete(@PathVariable int id) {
                employeeservice.delete(id);
                return "Employee has been deleted with id: "+id;
        }

        @PutMapping("/employee")
        public Employee Update(@RequestBody Employee employeeObj){
                employeeservice.save(employeeObj);
                return employeeObj;
        }

}
