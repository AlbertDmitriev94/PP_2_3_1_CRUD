package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    List<Car> listCars = new ArrayList<>();

    @Override
    public List<Car> getListCars() {
        listCars.add(new Car("BMW", "M3", 250));
        listCars.add(new Car("AUDI", "TT", 200));
        listCars.add(new Car("lamborgini", "Gallardo", 600));
        listCars.add(new Car("Hyndai", "Solaris", 150));
        listCars.add(new Car("Lada", "Granta", 90));
        return listCars;
    }

    @Override
    public List<Car> getCar(int count) {
        return getListCars().stream().limit(count).collect(Collectors.toList());
    }
}
