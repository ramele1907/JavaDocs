package ro.teamnet.zth.appl.service.impl;

import ro.teamnet.zth.api.annotations.MyService;
import ro.teamnet.zth.appl.dao.EmployeeDao;
import ro.teamnet.zth.appl.domain.Employee;
import ro.teamnet.zth.appl.service.EmployeeService;

import java.util.List;

/**
 * Created by user on 7/15/2016.
 */
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDao employeeDao = new EmployeeDao();

    @Override
    public List<Employee> findAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public Employee findOneEmployee(Long id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public void delete(Long id) {
        employeeDao.deleteEmployee(employeeDao.getEmployeeById(id));
    }
}
