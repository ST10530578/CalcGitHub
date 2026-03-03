package calcgithub;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatortest {
    
    @Test
    public void addsTwoNumbers(){
      Calculator calculator = new Calculator();
      assertEquals("1 + 1 should equal 2", 2, calculator.add(1, 1));
    }
    @Test
    public void subtractsTwoNumbers(){
      Calculator calculator = new Calculator();
      assertEquals("2 - 1 = 1", 1, calculator.subtract(2, 1));
    }
}
