package com.example.myfirstapplication;

@restcontroller
public class helloresource {

    @getmapping(path="/api/hello")
    public java.lang.String hello() {
        return "hello world from the server" ;
    }
}
