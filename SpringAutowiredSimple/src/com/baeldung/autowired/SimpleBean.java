package com.baeldung.autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class SimpleBean {

    public String ping(String prepos) {
        return prepos + " " + this + " is alive";
    }
}