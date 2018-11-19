package com.example.myfirstapplication;
import org.springframework.web.bind.annotation.getmapping;
import org.springframework.web.bind.annotation.restcibtrikker;
@restcontroller
public class helloresource {

    @getmapping(path="/api/hello")
    public java.lang.String hello() {
        return "hello world from the server" ;
    }
}
