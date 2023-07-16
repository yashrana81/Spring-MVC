package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

@Controller
public class ContactController {
    //@Autowired
    //UserService userService;
    //this method will add attributes to all the models returned by all the handler methods in this controller
    @ModelAttribute
    public void CommonData(Model model)
    {
        System.out.println("common data model attribute method");
        model.addAttribute("Header","YASH RANA");
    }


    @RequestMapping("/contact")
    public String showForm()
    {
        return "contact";
    }

//<-----------------------using @RequestParam---------------------->
//    @RequestMapping(path = "/processform" , method= RequestMethod.POST)
//    public String handleForm(@RequestParam("userEmail") String email, @RequestParam("userName") String name,
//                             @RequestParam("userPassword")String password, Model model)
//    {
//        System.out.println("Name: "+name+" Email: "+email+" pass: "+password);
//        User user =new User();
//        user.setUserEmail(email);
//        user.setUserName(name);
//        user.setUserPassword(password);
//        model.addAttribute("user",user);
//        return "success";
//    }


//    <------------using @ModelAttribute------------------>
    @RequestMapping(path = "/processform" , method= RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model)
    {
        //userService.createUser(user);
        System.out.println(user);
        return "success";
    }
}
