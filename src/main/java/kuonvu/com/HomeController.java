package kuonvu.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model m) {
        m.addAttribute("someAttr", "someValue");
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "Login";
    }
}
