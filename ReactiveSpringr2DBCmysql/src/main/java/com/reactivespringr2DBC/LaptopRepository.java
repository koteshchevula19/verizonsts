package com.reactivespringr2DBC;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends ReactiveCrudRepository<Laptop, Integer> {

}
