package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component

public class CarService {
    private List<Car> car;
    private int carcount;
    {car =new ArrayList<>();
        car.add(new Car(++carcount,"series1","model1"));
        car.add(new Car(++carcount,"series2","model2"));
        car.add(new Car(++carcount,"series3","model3"));
        car.add(new Car(++carcount,"series4","model4"));
        car.add(new Car(++carcount,"series5","model5"));
    }
    public List<Car> showCars(int count){

        return car.stream().limit(count).toList();
    }

}
