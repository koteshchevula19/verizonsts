package com.springreactive;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

	
	@GetMapping("/name")
	Mono<Student> getName() {
		
		return Mono.just(new Student("Kotesh",101));
	}
	
	@GetMapping("/names")
	Flux<Student> getNames() {
		return Flux.just(new Student("Kotesh",101),
				new Student("Kotesh",102),new Student("Kotesh",103)
				,new Student("Kotesh",105),new Student("Kotesh",151)
				,new Student("Kotesh",105),new Student("Kotesh",151)
				
			).delayElements(Duration.ofMillis(2000));
	}
}
