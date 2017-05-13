package com.baeldung.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AttributeBean {

    @Autowired
    private
    SimpleBean simpleBean;

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }
    
    public String tukTukBean(String prepos) {
        return getSimpleBean().ping(prepos);
    }
}
