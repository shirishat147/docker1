package docker.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MycontrollerAdd {
	@Autowired
	MySercvice service;
	 @GetMapping(value = "/add/{a}/{b}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public int sum(@PathVariable("a") int a,@PathVariable("b") int b) {
	        System.out.println("add function is getting called");
	        return service.add(a, b);
	 
	 }

}
