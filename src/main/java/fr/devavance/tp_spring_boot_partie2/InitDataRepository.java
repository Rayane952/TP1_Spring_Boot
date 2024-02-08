package fr.devavance.tp_spring_boot_partie2;

import fr.devavance.tp_spring_boot_partie2.beans.Employee;
import fr.devavance.tp_spring_boot_partie2.beans.Fonction;
import fr.devavance.tp_spring_boot_partie2.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static fr.devavance.tp_spring_boot_partie2.beans.Fonction.*;

@Component
class InitDataRepository implements CommandLineRunner {
    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public void run(String... strings) throws Exception {

        Employee employee1 = new Employee();
        employee1.setName("rayane");
        employee1.setFonction(DEV_OPS);
        employeeRepository.save(employee1);
    }

    }
