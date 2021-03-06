package helloPeter;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Pong";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/ping")
    public Greeting greeting() {
        String date = String.format("%1$te/%1$tm/%1$tY %1$tH:%1$tM:%1$tS %1$tz", new Date());
        return new Greeting(counter.incrementAndGet(),
                            template, date);
    }
}
