package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.UserDAO;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(value = "/user")
    public String showUser(Model model){
    model.addAttribute("users",userService.allUser());
    return "users";
    }
    @GetMapping(value = "/user/id")
    public String editUser(@RequestParam (value = "id",defaultValue = "0") int id,Model model){
        if (id>0) model.addAttribute("users",userService.getIdUser(id));
        return "editUser";
    }
    @GetMapping(value = "/addUser")
    public String saveUser(@RequestParam(value = "id", defaultValue = "0")int  id, Model model){
        model.addAttribute("users", new User());
        return "editUser";
    }
    @PostMapping("/user")
    public String saveUser(@ModelAttribute("users") User user){
        userService.save(user);
        return "redirect:/user";
    }
    @GetMapping(value = "/user/deleteUser")
    public String deleteUser(@RequestParam(value = "id")int id){

        userService.deleteUser(id);
        return "redirect:/user";
    }
}
