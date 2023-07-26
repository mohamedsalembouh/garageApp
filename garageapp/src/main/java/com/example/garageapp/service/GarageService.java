package com.example.garageapp.service;

import com.example.garageapp.model.Car;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
  static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
          new Car(1,"car1","br1",2020,Car.Color.BLUE),
          new Car(2,"car2","br2",2021,Car.Color.RED),
          new Car(3,"car3","br3",2022,Car.Color.GREEN)
  )) ;

 public List<Car> getCars(){
     return cars;
 }

 public Car getCar(int id){
 return cars.stream().filter(car -> car.getId()==id).findFirst().orElse(null);
 }
 public void deleteCar(int id){
      cars.removeIf(car -> car.getId()==id);
 }

 public void addCar(Car car){
     cars.add(car);
 }
 public void updateCar(Car car,int id){
     cars.forEach(car1 -> {
         if(car1.getId()==id){
             cars.set(cars.indexOf(car1),car);
         }
     });
 }
}
