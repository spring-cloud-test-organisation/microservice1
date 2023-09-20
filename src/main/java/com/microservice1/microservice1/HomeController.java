package com.microservice1.microservice1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${application.message}")
    private String activeProfile;

    @Value("${vendor-wise.url}")
    private String vendorURL;

    @GetMapping("/")
    public String hello() {
        return "<html>"
                + "<head><title>Classifying microservice configurations</title></head>"
                + "<body>"
                + "<h1>Hello from Spring Cloud Config Server!</h1>"
                + "<p>µS X base configuration " + activeProfile +"</p>"
                + "<p>Vendor A URL: " + vendorURL + "</p>"
                + "</body>"
                + "</html>";
    }
}
