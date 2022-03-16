package de.neuefische.oauthdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/echo")
public class EchoController {

    @GetMapping("/{value}")
    public String echo(@PathVariable String value, Principal principal) {
        return principal.getName() + " sagt " + value;
    }

}
