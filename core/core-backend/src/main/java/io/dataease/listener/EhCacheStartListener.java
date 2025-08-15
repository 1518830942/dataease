package io.dataease.listener;


import io.dataease.utils.ConfigUtils;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class EhCacheStartListener implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        String property = applicationContext.getEnvironment().getProperty("dataease.login_timeout", String.class, "480");
        System.setProperty("dataease.login_timeout", property);

        String ehcache = ConfigUtils.getConfig("dataease.path.ehcache", "D:/project/work/dataeaseResource/cache");
        System.setProperty("dataease.path.ehcache", ehcache);
    }
}
