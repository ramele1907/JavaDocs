package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParam;
import ro.teamnet.zth.appl.domain.Employee;
import ro.teamnet.zth.appl.service.EmployeeService;
import ro.teamnet.zth.appl.service.EmployeeServiceImpl;

import java.util.List;

/**
 * Created by user on 7/14/2016.
 */
@MyController(urlPath = "/employees")
public class EmployeeController {

    @MyRequestMethod(urlPath = "/all")
    public List<Employee> getAllEmployees() {
        EmployeeService emi = new EmployeeServiceImpl();
        return emi.findAllEmployees();
    }

    @MyRequestMethod(urlPath = "/one")
    public Employee getOneEmployee(@MyRequestParam(name="id") Long id) {

        Employee returned = null;
        EmployeeService es = new EmployeeServiceImpl();
        returned = es.findOneEmployee(id);
        return returned;

    }

    @MyRequestMethod(methodType = "DELETE", urlPath = "/delete")
    public void deleteOneEmployee(@MyRequestParam(name="id") Long id) {
        EmployeeService es = new EmployeeServiceImpl();
        es.delete(id);
    }
}
