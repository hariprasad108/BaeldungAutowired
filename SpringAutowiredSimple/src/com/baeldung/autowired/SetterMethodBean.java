package com.baeldung.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterMethodBean {
    SimpleBean simpleBean;

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    @Autowired
    public void setFirstBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    public String tukTukBean(String prepos) {
        return getSimpleBean().ping(prepos);
    }
}
