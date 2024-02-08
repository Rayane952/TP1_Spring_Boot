package fr.devavance.tp_spring_boot_partie2.controllers;

import fr.devavance.tp_spring_boot_partie2.beans.Employee;
import fr.devavance.tp_spring_boot_partie2.dao.IEmployeeController;
import fr.devavance.tp_spring_boot_partie2.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee") //
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @GetMapping("/home")
    public String displayHome(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("employee", new Employee());
        return "view_home";
    }

    @PostMapping("/addemployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employee/home";
    }
}

