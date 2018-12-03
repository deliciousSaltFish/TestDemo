package com.james.context;

import org.springframework.context.ApplicationContext;

public class ContextService {
    private Context context ;
    public Context getConfig() {
        if (context == null) {
            ApplicationContext appContext = ContextUtil.getApplicationContext();
            System.out.println(appContext);
            context = (Context) appContext.getBean("Context");
        }
        return context;
    }

    static class ConfigServiceHolder {
        static ContextService instance = new ContextService();
    }
    private ContextService() {
    }
    public static ContextService getInstance() {
        return ConfigServiceHolder.instance;
    }
}
