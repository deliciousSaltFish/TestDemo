package com.james.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Context {
    @Value("#{configureinfo['url']}")
    String url = "www.baidu.com";
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
