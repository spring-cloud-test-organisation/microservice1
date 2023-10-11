package com.microservice2.microservice2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @Value("${vendor-a.url}")
//    private String vendorAUrl;
//
//    @Value("${caches.time-to-live}")
//    private String timeToLive;
//
//    @Value("${vendor-a.password}")
//    private String vendorAPassword;
//
//    @Value("${vendor-b.url}")
//    private String vendorBUrl;
//
    @Value("${my.zone}")
    private String timeZone;
//
//    @Value("${spring.profiles.active}")
//    private String activeProfile;
//
    @Value("${vendor-wise.url}")
    private String wiseUrl;

    @Value("${dip-reuters-datastream-username}")
    private String test;

    @GetMapping("get")
    public String get() {
        return test + " " + wiseUrl + " " + timeZone;
    }

    @GetMapping("/")
    public String hello() {

        return "<html>"
                + "<head><link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n<title>Classifying microservice configurations</title></head>"
                + "<body>"
//                + "<h1>Hello from microservice2! Stage: "+ activeProfile + "</h1>"
//                + "<div class=\"alert alert-primary\" role=\"alert\">"  + "base configuration stored in µs/src/resources/application.yaml (Inside the binary (jar)): " + "time-to-live: " +  "<b>" +  timeToLive + "</b>" + "</div>"
//                + "<div class=\"alert alert-secondary\" role=\"alert\">"  + "environment specific configuration stored in µs/src/resources/application-{env}.yaml (Inside the binary (jar)) " + "vendor-a: " +  "<b>" +  vendorAUrl + "</b>" + "</div>"
//                + "<div class=\"alert alert-success\" role=\"alert\">"  + "Shared base configuration stored in application-{env}.yaml (Defined in the Azure Devops repository) " + "timezone: " +  "<b>" +  timeZone + "</b>" + "</div>"
//                + "<div class=\"alert alert-info\" role=\"alert\">"  + "Shared configuration stored in # {group}/{env}.yaml (Defined in the Azure Devops repository)" + "vendor-wise.url: " +  "<b>" +  wiseUrl + "</b>" + "</div>"
//                + "<div class=\"alert alert-info\" role=\"alert\">"  + "Shared configuration stored in # {group}/{env}.yaml (Defined in the Azure Devops repository)" + "vendor-wise.url: " +  "<b>" +  test + "</b>" + "</div>"
                + "</body>"
                + "</html>";
    }



}
