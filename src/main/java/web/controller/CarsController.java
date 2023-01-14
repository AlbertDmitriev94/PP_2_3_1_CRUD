package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {

	private CarServiceImp carServiceImp;

	@Autowired
	public CarsController(CarServiceImp carServiceImp) {
		this.carServiceImp = carServiceImp;
	}


	@GetMapping(value = "/cars")
	public String getCarList(@RequestParam(value = "count", defaultValue = "5", required = false)
							 int count, ModelMap model) {
		model.addAttribute("cars", carServiceImp.getCar(Math.abs(count)));
		return "/cars";
	}
	
}