package helloPeter.test.web.controller;
 
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;
import helloPeter.Greeting;
import helloPeter.GreetingController;
 
public class GreetingControllerTest extends TestCase {
 
	@Test
	public void testTheMethodGreetingsShouldReturnTheSame() {
                //GIVEN		
                GreetingController control = new GreetingController();
                //WHEN
	        Greeting result = control.greeting();
                //THEN
	        assertNotNull(result);
	        assertEquals(1,result.getId());
	}

       @Test
        public void testTheMethodGreetingsShouldReturnTheSame2() {
                //GIVEN         
                GreetingController control = new GreetingController();
                //WHEN
                Greeting result = control.greeting();
                //THEN
                assertNotNull(result);
                assertEquals(2,control.greeting().getId());
        }
        
        @Test
        public void testTheMethodGreetingsShouldReturnTheSame3() {
                //GIVEN         
                GreetingController control = new GreetingController();
                //WHEN
                Greeting result = control.greeting();
                //THEN
                assertNotNull(result);
                assertEquals("Pong",control.greeting().getContent());
        }
}
