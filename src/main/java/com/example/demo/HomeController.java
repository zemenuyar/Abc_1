package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Callable;

@Controller
public class HomeController {
    @Autowired
    CarRepository carRepository;
    @RequestMapping("/")
    public String index(Model model){
        //first let`s create a car
      Car car = new Car();
      car.setManfucaturer("zee Toyota");
      car.setModel("Puries Haybrid");
      car.setYear(2017);
      car.setMsrp(25000);
      return "index";
    }
}
