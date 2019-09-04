package com.car.usingdao.service;

import com.car.usingdao.com.car.usingdao.entity.CarsClass;

import java.util.List;

public interface CarsService {

    CarsClass saveCars(CarsClass carsClass);

    CarsClass updateCars(CarsClass carsClass);

    List<CarsClass> getAllCarsList();

    CarsClass getCar(Long idCar);

    CarsClass deleteCar(Long idCar);

}
