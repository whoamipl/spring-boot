package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "<p style=\"font-size: 36px;position: absolute; top: 50%; left: 50%; margin-left: -75px;margin-top: -25px;\">Hello World!</p>";
    }

}
  