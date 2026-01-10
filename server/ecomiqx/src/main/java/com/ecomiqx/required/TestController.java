package com.ecomiqx.required;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tests")
public class TestController {

        @GetMapping
       public String getMessage(){

            return "first api is working fine";
       }
}
