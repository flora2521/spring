package org.yi.iocbeanlifecicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xsls on 2019/8/15.
 */
//@Configuration
@ComponentScan(basePackages = {"org.yi.iocbeanlifecicle"})
        //excludeFilters={@ComponentScan.Filter(type=FilterType.ANNOTATION,value={Controller.class})})

public class MainConfig {
//
//    @Bean("car")
//    public Car car(){
//        Car car = new Car();
//        car.setName("车子");
//		car.setTank(tank());
//        // 如果不去ioc 容器中拿   是不是每次都会创建新的
//        // 都会先根据方法名  getBean("car")
//        return car;
//    }
//
//    @Bean
//    public Tank tank(){
//        return new Tank();
//    }
}
