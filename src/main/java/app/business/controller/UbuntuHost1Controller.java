package app.business.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UbuntuHost1Controller {


    @GetMapping("/get-hi-ubuntu-host1")
    public String getHelloFromUbuntuAppFromHost1(){
        return "Hi, I app1 from Ubuntu host 1";
    }
}
