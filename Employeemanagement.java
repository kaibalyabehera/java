
    package com.Employeemanagement;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;
import com.employee.dao.EmployeeDAO;
import com.employee.Employee;

public class EmployeeApp {
    public static void main(String[] args) {

        EntityManagerFactory factory = null;

        try {
            factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
            EntityManager em = factory.createEntityManager();

            EmployeeDAO employeeDao = new EmployeeDAO(em);

            Employee emp1 = new Employee("Kaibalya", "Behera", 60000);
            Employee emp2 = new Employee("Bibek", "Naik", 30000);

            // To save employee details
            employeeDao.saveEmployee(emp1);
            employeeDao.saveEmployee(emp2);

            // Print the employee details
            Employee empById = employeeDao.findEmployeeById(1L);
            System.out.println("Employee: " + empById);
            System.out.println();

            Employee empById2 = employeeDao.findEmployeeById(2L);
            System.out.println("Employee: " + empById2);
            System.out.println();

        } catch (HibernateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

/*
 * --------------------------------- OUTPUT
 * -----------------------------------------------------------------------------
 * --------------------------------------------------------------------------
 * 
 * Hibernate: select employee0_.id as id1_0_0_, employee0_.firstName as
 * firstnam2_0_0_, employee0_.lastName as lastname3_0_0_, employee0_.salary as
 * salary4_0_0_ from Employee employee0_ where employee0_.id=?
 * Employee: Employee(id=1, firstName=Kaibalya, lastName=Behera, salary=60000)
 * 
 * Hibernate: select employee0_.id as id1_0_0_, employee0_.firstName as
 * firstnam2_0_0_, employee0_.lastName as lastname3_0_0_, employee0_.salary as
 * salary4_0_0_ from Employee employee0_ where employee0_.id=?
 * Employee: Employee(id=2, firstName=Bibek, lastName=Naik, salary=30000)
 * 
 */

