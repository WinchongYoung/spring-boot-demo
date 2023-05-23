package com.xkcoding.properties.property;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {
    "classpath:application_yml.yml",
}, factory = YamlPropertySourceFactory.class)
public class ConfigInit {

}
