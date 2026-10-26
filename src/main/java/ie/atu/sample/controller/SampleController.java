package ie.atu.sample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class SampleController {

    @GetMapping
    public String getHealth()
    {
        return "OK";
    }

}