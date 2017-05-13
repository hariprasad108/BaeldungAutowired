package com.baeldung.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorParamBean {

    SimpleBean simpleBean;

    @Autowired
    private ConstructorParamBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public String tukTukBean(String prepos) {
        return getSimpleBean().ping(prepos);
    }
}