package formexample.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class control {
    @RequestMapping("/login")   
     public String registerform(@ModelAttribute("frm") Forms frm)
    {
        return "register";
    }
    @RequestMapping("/registersuccess")
    public String success(@ModelAttribute("frm") Forms frm)
    {
        return "registersuccess";
    }
}
