package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "<p style=\"font-size: 36px; text-align: center; margin-top: auto; margin-bottom: auto;\">Hello World!</p>";
    }

}
