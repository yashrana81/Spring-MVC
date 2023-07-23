package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UserService;

@Controller
public class ContactController {
    @Autowired
    private UserService userService;
    //this method will add attributes to all the models returned by all the handler methods in this controller
    @ModelAttribute
    public void CommonData(Model model)
    {
        System.out.println("common data model attribute method");
        model.addAttribute("Header","YASH RANA");
    }

    @RequestMapping("/contact/{id}")
    public String showForm(@PathVariable("id") String id)
    {
        id=null;
        int n=id.length();
        System.out.println("id is "+ id +"length "+n);
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
        //If the userName field is empty in the form it will redirect it to the form back
        if(user.getUserName().isBlank())
        {
            return "redirect:/contact";
        }
        this.userService.createUser(user);
        System.out.println(user);
        return "success";
    }

//    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(value = Exception.class)
//    public String exceptionhandler.exceptionHandler()
//    {
//        return "error";
//    }
}
