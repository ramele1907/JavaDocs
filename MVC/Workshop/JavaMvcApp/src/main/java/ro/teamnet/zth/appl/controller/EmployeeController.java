package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParam;
import ro.teamnet.zth.appl.domain.Employee;
import ro.teamnet.zth.appl.service.EmployeeService;
import ro.teamnet.zth.appl.service.impl.EmployeeServiceImpl;

import java.util.List;

/**
 * Created by user on 7/14/2016.
 */
@MyController(urlPath = "/employees")
public class EmployeeController {
    private final EmployeeService employeeService = new EmployeeServiceImpl();

    @MyRequestMethod(urlPath = "/all")
    public List<Employee> getAllEmployees() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        return employeeService.findAllEmployees();
    }

    @MyRequestMethod(urlPath = "/one")
    public Employee getOneEmployee(@MyRequestParam(name="id") Long id) {

        Employee returned = null;
        EmployeeService employeeService = new EmployeeServiceImpl();
        returned = employeeService.findOneEmployee(id);
        return returned;

    }

    @MyRequestMethod( urlPath = "/delete", methodType = "DELETE")
    public void deleteOneEmployee(@MyRequestParam(name="id") Long id) {
        EmployeeService es = new EmployeeServiceImpl();
        es.delete(id);
    }
}
