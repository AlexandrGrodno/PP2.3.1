package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.UserDAO;
import web.service.CarService;

@Controller
public class CarsController {
    private final CarService carService;
    private final UserDAO userDAO;
    @Autowired
    public CarsController(CarService carService, UserDAO userDAO){
        this.carService = carService;
        this.userDAO = userDAO;
    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue="5")int count, Model   model){

        model.addAttribute("cars",userDAO.allUser());
        return "cars";
    }
}
