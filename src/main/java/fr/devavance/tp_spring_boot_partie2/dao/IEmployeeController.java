package fr.devavance.tp_spring_boot_partie2.dao;

import fr.devavance.tp_spring_boot_partie2.beans.Employee;
import org.springframework.ui.Model;

public interface IEmployeeController {

    String displayHome(Model model);
    String addEmployee(Employee employee);
}

