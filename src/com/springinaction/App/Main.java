package com.springinaction.App;

import com.springinaction.common.PerformException.PerformException;
import com.springinaction.springidol.Perfomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Created by daijitao on 2018/4/13.
 */
public class Main {
    public static void main(String[] args) throws PerformException {
        // 加载XML文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-config.xml");
        Perfomer perfomer = (Perfomer)ctx.getBean("duke");
        perfomer.perform();

        Properties prop = new Properties();
    }
}
