package com.car.usingdao.controller;

import com.car.usingdao.com.car.usingdao.entity.CarsClass;
import com.car.usingdao.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("carsClass")
@RestController
public class CarsController {

    @RequestMapping("/")
    public String something()
    {
        return " ROGER that! ";
    }


    @Autowired
    private CarsService carsService;

    // Have not added @Responsebody Annotation


    @PostMapping("/save")
    public CarsClass save(CarsClass carsClass)
    {
        return carsService.saveCars(carsClass);
    }


    @PutMapping("/update")
    public CarsClass update(CarsClass carsClass) {

        return  carsService.updateCars(carsClass);
    }


    @GetMapping("/all")
    public List<CarsClass> getAllCarsList()
    {
        return carsService.getAllCarsList();
    }

    @GetMapping("/by/{idCar}")
    public CarsClass getCar(@PathVariable(name = "idCar") Long idCar)
    {
        return carsService.getCar(idCar);
    }

    @DeleteMapping("/by/{idCar}")
    public void deleteCar(@PathVariable(name = "idCar") Long idCar)
    {
        carsService.deleteCar(idCar);
    }

}
