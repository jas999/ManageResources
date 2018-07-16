package com.s4technology.model;

import org.springframework.stereotype.Service;

@Service
public class Greeting {

    private final long id = 8237;
    private final String content = "Hello";

   /* public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }*/

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}