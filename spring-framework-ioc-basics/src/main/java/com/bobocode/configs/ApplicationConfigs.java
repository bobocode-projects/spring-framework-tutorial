package com.bobocode.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * This class provides a  @{@link Configuration} for a Spring container. This configs specify which classes (in which package)
 * should be scanned by the container. To specify the package we use @{@link ComponentScan}.
 *
 * The container will discover specified package and its sub-folders, to find
 * all classes marked @{@link Component}. For each component Spring should create a bean (an instance of the class)
 * marked as component)
 */
@Configuration
@ComponentScan(basePackages = "com.bobocode")
public class ApplicationConfigs {

}
