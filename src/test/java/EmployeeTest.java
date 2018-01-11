import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Fred", "NX552223C", 15000.00);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Fred", employee.getName());
    }

    @Test
    public void employeeHasNiNumber(){
        assertEquals("NX552223C", employee.getNiNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(15000.00, employee.getSalary(),0.00);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30000.00, employee.raiseSalary(15000.00), 0.00);
    }

//    @Test
//    public void canDecrementSalary(){
//        assertEquals(0, employee.raiseSalary(-15000.00), 0.00);
//    }

    @Test
    public void cannotDecrementSalary(){
        assertEquals(15000.00, employee.raiseSalary(-150000.00), 0.00);
    }

    @Test
    public void payBonusReturnsOnePercentOfSalary(){
        assertEquals(150.00, employee.payBonus(), 0.00);
    }
}
