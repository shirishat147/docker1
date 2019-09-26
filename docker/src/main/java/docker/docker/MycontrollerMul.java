package docker.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MycontrollerMul {
	@Autowired
	MySercvice service;
	 @GetMapping(value = "/multiply/{a}/{b}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public int multiply(@PathVariable("a") int a,@PathVariable("b") int b) {
	        System.out.println("Multiplication function is getting called");
	        return service.mul(a, b);
	 
	 }
}
