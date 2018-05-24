package com.springinaction.App;

import com.springinaction.common.PerformException.PerformException;
import com.springinaction.springidol.Perfomer;
import com.springinaction.springidol.PoeticJuggler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by daijitao on 2018/4/13.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 加载XML文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-config.xml");
        Perfomer perfomer = (Perfomer)ctx.getBean("duke");
        perfomer.perform();
        System.out.println("====================================>");
        Perfomer po = (Perfomer)ctx.getBean("poeticJuggler");
        po.perform();

        Perfomer in = (Perfomer)ctx.getBean("kenny");
        in.perform();

        Properties prop = new Properties();

           // prop.load(Main.class.getClassLoader().getResourceAsStream("spring.properties"));

    }
}
