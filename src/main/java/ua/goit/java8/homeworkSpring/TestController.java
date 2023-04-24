package ua.goit.java8.homeworkSpring;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
    @GetMapping("/test")
    public ModelAndView showTestPage() {
        ModelAndView modelAndView = new ModelAndView("test");
        return  modelAndView;
    }
}
