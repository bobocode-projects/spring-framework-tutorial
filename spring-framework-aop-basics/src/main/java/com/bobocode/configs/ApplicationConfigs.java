package com.bobocode.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * This class specify application context configuration. Basically, it's all about which instances of which classes
 * should be created and registered in the context. An instance that is registered int the context is called 'bean'.
 *
 * To tell the container, which bean should be created, you could either specify packages to scan using @{@link ComponentScan},
 * or declare your own beans using @{@link Bean}. When you use @{@link ComponentScan} the container will discover
 * specified package and its sub-folders, to find all classes marked @{@link Component}.
 *
 * If you want to import other configs from Java class or XML file, you could use @{@link org.springframework.context.annotation.Import}
 * and @{@link org.springframework.context.annotation.ImportResource} accordingly
 */
@Configuration
@ComponentScan(basePackages = "com.bobocode")
@EnableAspectJAutoProxy
public class ApplicationConfigs {

}
