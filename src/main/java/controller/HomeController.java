package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(Model model)
    {
        model.addAttribute("name","yash rana");
        System.out.println("this is home url");
        return "home";
    }

    @RequestMapping("/info")
    public ModelAndView info()
    {
        System.out.println("this is info url");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","yash");
        modelAndView.addObject("roll",127);
        List<Integer> marks= new ArrayList<>();
        marks.add(99);
        marks.add(90);
        marks.add(87);
        modelAndView.addObject("marks",marks);
        modelAndView.setViewName("info");
        return modelAndView;
    }
}
