package hu.cubix.fruitnamedisplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FruitsNameDisplayTLController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
