package app.web;


import app.data.User;
import app.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Nikita.D.Brylyakov on 14.08.2017.
 */


@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = GET)
    public String getUserByLogin(@RequestParam("login") String login, Model model){
        User user = userRepository.findUserByLogin(login);
        model.addAttribute("user", user);
        return "user";
    }
}
