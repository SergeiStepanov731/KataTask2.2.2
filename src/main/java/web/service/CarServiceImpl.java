package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();{
        Car car1 = new Car("Mazda", 2017, "red");
        Car car2 = new Car("KIA", 2021, "white");
        Car car3 = new Car("MAN", 2005, "black");
        Car car4 = new Car("Audi", 2020, "black");
        Car car5 = new Car("Hyundai", 2015, "grey");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(int a) {
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}
