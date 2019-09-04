package com.car.usingdao.service.impl;
import com.car.usingdao.DAO.CarsDAO;
import com.car.usingdao.com.car.usingdao.entity.CarsClass;
import com.car.usingdao.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements CarsService {

    @Autowired
    private CarsDAO carsDAO;

    @Override
    public CarsClass saveCars(CarsClass carsClass) {
        return carsDAO.save(carsClass);
    }

    @Override
    public CarsClass updateCars(CarsClass carsClass) {
        return carsDAO.saveAndFlush(carsClass);
    }

    @Override
    public List<CarsClass> getAllCarsList() {
        return carsDAO.findAll();
    }

    @Override
    public CarsClass getCar(Long idCar) {

        return null;
       //return carsDAO.findOne(idCar);
    }

    @Override
    public CarsClass deleteCar(Long idCar) {

        //carsDAO.delete(idCar);
        return null;
    }
}
