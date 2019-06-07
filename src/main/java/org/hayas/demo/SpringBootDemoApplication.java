package org.hayas.demo;

import java.util.Arrays;

import org.hayas.demo.dto.Laptop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication
{

   public static void main(String[] args)
   {
      ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
      //lap object will be created n  injected by Spring container - Dependency Injecction
      Laptop lap = (Laptop) context.getBean(Laptop.class);
      lap.getHardDisk().verify();
   }

   @Bean
   public CommandLineRunner commandLineRunnerss(ApplicationContext ctx)
   {
      return args -> {

         System.out.println("Let's inspect the beans provided by Spring Boot:");

         String[] beanNames = ctx.getBeanDefinitionNames();
         Arrays.sort(beanNames);
         for (String beanName : beanNames)
         {
            System.out.println(beanName);
         }

      };
   }
}
