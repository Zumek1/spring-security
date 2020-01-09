package pl.robert.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHallo(){
        return "hello";
    }

    @GetMapping("/hello2")
    public String sayHallo2(){
        return "hello2";
    }


}
