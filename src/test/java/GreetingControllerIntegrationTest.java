package helloPeter.test.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junit.framework.TestCase;

import helloPeter.Greeting;
import helloPeter.GreetingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;
import java.util.Date;

import org.json.*;

/**
 * {@code @SpringBootTest} with a random port for {@link SampleTestApplication}.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
public class GreetingControllerIntegrationTest extends TestCase {

	private static final Greeting TestGreeting = new GreetingController().greeting(); 

	@Autowired
	private TestRestTemplate restTemplate;

	@MockBean
	private GreetingController greetingController;

	@Before
	public void setup() {
                given(this.greetingController.greeting()).willReturn(new Greeting(1,"Pong",String.format("%1$te/%1$tm/%1$tY %1$tH:%1$tM:%1$tS %1$tz", new Date())));
	}

	@Test
	public void test() {
		String response = this.restTemplate.getForEntity("/ping", String.class).getBody();
                assertEquals(new JSONObject(response).getString("content"),"Pong");
	}

}
