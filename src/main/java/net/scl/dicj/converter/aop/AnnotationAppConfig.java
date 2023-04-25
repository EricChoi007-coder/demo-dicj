package net.scl.dicj.converter.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("net.demoproject")
@EnableAspectJAutoProxy
public class AnnotationAppConfig {
}
