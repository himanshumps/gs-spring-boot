package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "<html><head><title>Spring boot</title></head><body><h1><i>Hi Everyone! Greetings from Spring Boot!</i></h1></body></html>";
    }
    
}
