package com.greedystar.generator;

import com.greedystar.generator.invoker.One2ManyInvoker;
import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Author GreedyStar
 * Date   2018/9/5
 */
@SpringBootApplication
@ServletComponentScan
@EnableScheduling
@Configuration
@ComponentScan(basePackages = {"com"})
@MapperScan("com.mi.youpin.tuishouserver.mapper")
public class Main {

//    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
//    }
    public static void main(String[] args) {
        single();
    }

//    public static void many2many() {
//        Invoker invoker = new Many2ManyInvoker.Builder()
//                .setTableName("user")
//                .setClassName("User")
//                .setParentTableName("role")
//                .setParentClassName("Role")
//                .setRelationTableName("user_role")
//                .setForeignKey("userId")
//                .setParentForeignKey("roleId")
//                .build();
//        invoker.execute();
//    }
//
    public static void one2many() {
        Invoker invoker = new One2ManyInvoker.Builder()
                .setTableName("t_feedback")
                .setClassName("Feedback")
                .setParentTableName("t_feedback_url")
                .setParentClassName("FeedbackUrl")
                .setForeignKey("fid")
                .build();
        invoker.execute();
    }

    public static void single() {
        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("t_robot_seal_detail")
                .setClassName("RobotSealDetail")
                .build();
        invoker.execute();
    }

}
