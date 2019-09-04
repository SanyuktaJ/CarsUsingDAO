package com.car.usingdao.com.car.usingdao.entity;


import javax.persistence.*;

@Entity
@Table(name = "TableforCars")
public class CarsClass {

    @Id
    @Column(name="car_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCar;

    @Column(name="car_name")
    private String nameCar;

    @Column(name="car_type")
    private String typeCar;

    @Column(name = "carHas_airbags")
    private String airbags;

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getAirbags() {
        return airbags;
    }

    public void setAirbags(String airbags) {
        this.airbags = airbags;
    }

}
