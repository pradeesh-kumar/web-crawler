/*
 * Copyright (c) 2021. Pradeesh Kumar
 */
package org.pradeesh.crawler.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * The type Crawler application.
 *
 * @author pradeesh.kumar
 */
@SpringBootApplication(scanBasePackages = {"org.pradeesh.crawler", "org.pradeesh.crawler.common", "org.pradeesh.crawler.web"})
@ConfigurationPropertiesScan("org.pradeesh.crawler.common.config")
public class CrawlerApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(CrawlerApplication.class, args);
    }
}
