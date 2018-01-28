package com.gmail.myyujinn;

import com.gmail.myyujinn.controllers.ConstructorInjectedController;
import com.gmail.myyujinn.controllers.GetterInjectedController;
import com.gmail.myyujinn.controllers.MyController;
import com.gmail.myyujinn.controllers.PropertyInjectedController;
import com.gmail.myyujinn.examplebeans.FakeDataSource;
import com.gmail.myyujinn.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gmail.services", "com.gmail.myyujinn"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());


    }
}
