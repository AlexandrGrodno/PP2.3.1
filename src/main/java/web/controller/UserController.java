package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.DAO.UserDAO;

@Controller
public class UserController {
    private UserDAO userDAO;
    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @GetMapping(value = "/user")
    public String showUser(Model model){
    model.addAttribute("users",userDAO.allUser());
    return "users";
    }
}
