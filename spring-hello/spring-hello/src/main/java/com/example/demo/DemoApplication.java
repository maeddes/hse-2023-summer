package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	String state = "wasweissich";

	@GetMapping("/hello")
	public String sayHello(){

		return "Hallo Esslingen Summer Semester 23";

	}

	@DeleteMapping("/setPropertyOfPerson/{variable}")
	public String postVariable(@PathVariable String variable){

		System.out.println(" #### xxSubmitted variable: "+variable);
		return "The variable which cchas been submitted is: "+variable;
	}

	@Operation(summary = "Create a new person")
	@ApiResponses(value = { 
		@ApiResponse(responseCode = "400", description = "Invalid person", 
		  content = @Content), 
		@ApiResponse(responseCode = "404", description = "Person does not exist", 
		  content = @Content) })
	@PostMapping("/person/{name}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String createPerson(@PathVariable String name){

		Object person = new Object();
		System.out.println(" ##### XwefdeSubmitted name: "+name);
		return name;

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
