package Calculator;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DoArithmeticTest {

	@Test
    public void testAddition() {
		DoArithematic a = new DoArithematic();
        double result = a.Add(2, 2);
        assertEquals(4, result, 0.001); // 3rd parameter is the delta for double comparison
    }

    @Test
    public void testSubtraction() {
    	DoArithematic a = new DoArithematic();
        double result = a.Subtract(5, 3);
        assertEquals(2, result, 0.001);
    }
    
    @Test
    public void testMultiplication() {
    	DoArithematic a = new DoArithematic();
        double result = a.Multiply(5, 3);
        assertEquals(2, result, 0.001);
    }
    
    @Test
    public void testDivision() {
    	DoArithematic a = new DoArithematic();
        double result = a.Divide(6, 3);
        assertEquals(2, result, 0.001);
    }
}
