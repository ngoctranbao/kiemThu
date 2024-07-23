import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElectricLineTest {
    @Test
    public void testcase1() {
        assertEquals(-1,Electric.electricBill("CN", 1000000));
    }

    
    @Test
    public void testcase2() {
        assertEquals(34000,Electric.electricBill("CN", 20));
    }
    
    @Test
    public void testcase3() {
        assertEquals(-1,Electric.electricBill("CD", 50));
    }
    
    @Test
    public void testcase4() {
        assertEquals(36000,Electric.electricBill("GD", 20));
    }
    
    @Test
    public void testcase5() {
        assertEquals(185000,Electric.electricBill("GD", 100));
    }
    
    @Test
    public void testcase6() {
        assertEquals(395000,Electric.electricBill("GD", 200));
    }
    
}
