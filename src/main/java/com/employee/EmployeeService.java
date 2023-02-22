package com.employee;

import com.employee.model.BranchModel;
import com.employee.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<EmployeeModel> list;

    public EmployeeService() {
        this.list = new ArrayList<>();
        list.add(new EmployeeModel(1L,"son","Ha noi",new BranchModel(1L,"C10")));
    }
    public List<EmployeeModel> findAll(){
        return list;
    }
    public void save(EmployeeModel employeeModel){
        list.add(employeeModel);
    }
}
