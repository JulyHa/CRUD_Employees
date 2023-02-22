package com.employee.controller;

import com.employee.BranchService;
import com.employee.EmployeeService;
import com.employee.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private BranchService branchService;

    @GetMapping
    private ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("lists", employeeService.findAll());
        return modelAndView;


    }

    @GetMapping("/create")
    private ModelAndView createFrom() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("employeeList", new EmployeeModel());
        modelAndView.addObject("branchList", branchService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    private String create(@ModelAttribute EmployeeModel employeeList) {
        employeeService.save(employeeList);
        return "redirect:/employees";
    }
}


