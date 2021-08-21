package cz.vutbr.feec.utko.bpcmds.du1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Du1Application {

	public static void main(String[] args) {
		SpringApplication.run(Du1Application.class, args);
	}
	@GetMapping("/index")
	public String index(@RequestParam(value = "jmeno", defaultValue = "") String jmeno) {
		ArrayList<String> jmena = new ArrayList<>(List.of("Bob", "Alice", "Eva", "Alena", "Marek"));
		// adding name to array when is not blank
		if(!jmeno.equals("")){
			jmena.add(jmeno);
		}
		StringBuilder ret = new StringBuilder();
		for (String i:jmena){
			if (!ret.toString().equals("")){
				ret.append(" ").append(i);
			}
			else {
				ret = new StringBuilder(i);
			}
		}
		return ret.toString();

	}
}
