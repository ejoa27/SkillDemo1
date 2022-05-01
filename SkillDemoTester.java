import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testIsEven(){
        assertEquals(true, SkillDemo.isEven(2));
    }
}