package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImp implements CarService {
    private CarDao carDao;
    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }
}
