package com.example.garageapp.controllers;

import com.example.garageapp.model.Car;
import com.example.garageapp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@RestController
public class GarageController {
   @Autowired
    private GarageService garageService;
    @RequestMapping(method = RequestMethod.GET,value = "/cars")
    public List<Car> getCars(){
    return garageService.getCars();
    }
    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable int id){
     return garageService.getCar(id);
 }
 @RequestMapping(method = RequestMethod.DELETE,value = "/cars/{id}")
 public void deletecar(@PathVariable int id){
     garageService.deleteCar(id);
 }
 @RequestMapping(method = RequestMethod.POST,value = "/cars")
 public void addcar(@RequestBody Car car){
     garageService.addCar(car);
 }
 @RequestMapping(method = RequestMethod.PUT,value = "/car/{id}")
 public  void updatecar(@RequestBody Car car,@PathVariable int id){
     garageService.updateCar(car,id);
 }
}
