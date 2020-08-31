package io.metersphere.node.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = JmeterProperties.JMETER_PREFIX)
@Setter
@Getter
public class JmeterProperties {
    public static final String JMETER_PREFIX = "jmeter";
    private String heap = "-Xms1g -Xmx1g -XX:MaxMetaspaceSize=256m";
}
