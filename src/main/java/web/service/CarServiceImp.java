package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
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
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else if (count < 0) {
            return cars.stream().limit(0).toList();
        } else {
            return cars.stream().limit(count).toList();
        }
    }
}
