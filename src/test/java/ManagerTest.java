import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Fred", "NX552223C", 15000.00,"HR");
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("HR", manager.getDepartment());
    }
}
