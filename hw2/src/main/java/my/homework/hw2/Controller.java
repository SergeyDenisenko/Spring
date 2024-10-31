package my.homework.hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Greeting greeting;

    @GetMapping("/")
    public String hello() {
        return greeting.getText();
    }
}
