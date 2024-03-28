package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping(value = "/user/id")
    public String editUser(@RequestParam (value = "id") int id,Model model){
        model.addAttribute("user",userDAO.getIdUser(id));
        return "editUser";
    }
}
