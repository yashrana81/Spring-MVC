package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String showForm()
    {
        return "contact";
    }

    @RequestMapping(path = "/processform" , method= RequestMethod.POST)
    public String handleForm(@RequestParam("email") String email, @RequestParam("userName") String name,
                             @RequestParam("userPassword")String password, Model model)
    {
        System.out.println("Name: "+name+" Email: "+email+" pass: "+password);
        model.addAttribute("name",name);
        model.addAttribute("email",email);
        model.addAttribute("password",password);
        return "success";
    }
}
