package zuulserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServerApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(ZuulServerApplication.class).web(true).run(args);
  }
}
