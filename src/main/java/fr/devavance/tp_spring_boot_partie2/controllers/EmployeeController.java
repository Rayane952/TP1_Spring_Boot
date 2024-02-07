package fr.devavance.tp_spring_boot_partie2.controllers;

import fr.devavance.tp_spring_boot_partie2.beans.Employee;
import fr.devavance.tp_spring_boot_partie2.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @RequestMapping("/view_employees")
    public String findAllEmployee(Model model){
        model.addAttribute("employees", employeeRepository.findAll());
        return "view_employees";
    }
    @GetMapping("/view_employees")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("employee", new Employee());
        return "view_employees";
    }
    @PostMapping("/addemployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/view_employees";
    }
}