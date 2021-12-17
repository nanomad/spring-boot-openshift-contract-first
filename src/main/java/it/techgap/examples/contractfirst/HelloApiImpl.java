package it.techgap.examples.contractfirst;

import it.techgap.examples.contractfirst.api.HelloApi;
import it.techgap.examples.contractfirst.model.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiImpl implements HelloApi {

    @Override
    public ResponseEntity<HelloResponse> sayHello() {
        return ResponseEntity.ok(new HelloResponse().hello("Hello, world!"));
    }
}
