package com.example.garageapp.service;

import com.example.garageapp.model.Car;
import com.example.garageapp.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
    @Autowired
    GarageRepository garageRepository;

 public List<Car> getCars(){
     List<Car> cars = new ArrayList<>();
     garageRepository.findAll().forEach(car -> {
         cars.add(car);
     });
     return cars;
 }

 public Car getCar(Long id){
 return garageRepository.findById(id).orElse(null);
 }
 public void deleteCar(Long id){
      garageRepository.deleteById(id);
 }

 public void addCar(Car car){
     garageRepository.save(car);
 }
 public void updateCar(Car car,int id){
   garageRepository.save(car);
 }
}
