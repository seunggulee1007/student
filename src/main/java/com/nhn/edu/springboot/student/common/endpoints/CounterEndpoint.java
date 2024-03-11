package com.nhn.edu.springboot.student.common.endpoints;

import jakarta.annotation.Nullable;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Endpoint(id = "counter")
public class CounterEndpoint {

    private final AtomicLong counter = new AtomicLong();

    // curl -XGET http://localhost:8080/actuator/counter
    @ReadOperation
    public Long read() {
        return counter.get();
    }

    // curl –X POST -H"Content-Type: application/json" -d'{"delta":100}'  http://localhost:8080/actuator/counter
    @WriteOperation
    public Long increment(@Nullable Long delta) {
        if (delta == null) {
            return counter.incrementAndGet();
        }
        return counter.addAndGet(delta);
    }

    // curl –X DELETE http://localhost:8080/actuator/counter
    @DeleteOperation
    public Long reset() {
        counter.set(0);
        return counter.get();
    }

}
