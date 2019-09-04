package com.car.usingdao.DAO;

import com.car.usingdao.com.car.usingdao.entity.CarsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarsDAO extends JpaRepository<CarsClass, Long> {
}
