package my.homework.hw2;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    private String text = "Hello!";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
