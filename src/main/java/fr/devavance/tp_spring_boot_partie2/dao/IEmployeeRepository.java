package fr.devavance.tp_spring_boot_partie2.dao;

import fr.devavance.tp_spring_boot_partie2.beans.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
    // Aucun besoin de définir des méthodes ici, tout est hérité de CrudRepository
}
