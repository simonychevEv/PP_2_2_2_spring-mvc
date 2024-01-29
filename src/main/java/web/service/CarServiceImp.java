package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Kia", "V6", 2014));
        cars.add(new Car("Hyundai", "V8", 2016));
        cars.add(new Car("Honda", "V12", 2020));
        cars.add(new Car("Acura", "V6", 2018));
        cars.add(new Car("Fiat", "V8", 2021));
    }

    @Override
    public List<Car> getCars(Integer count) {
        count = (count == null || count >= 5) ? 5 : count < 0 ? 0 : count;
        return cars.stream().limit(count).toList();
    }
}
