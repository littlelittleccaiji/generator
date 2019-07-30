package com.greedystar.generator;

import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Author GreedyStar
 * Date   2018/9/5
 */
@SpringBootApplication
@ServletComponentScan
@EnableScheduling
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
//    public static void main(String[] args) {
//        single();
//    }

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
//    public static void one2many() {
//        Invoker invoker = new One2ManyInvoker.Builder()
//                .setTableName("user")
//                .setClassName("User")
//                .setParentTableName("office")
//                .setParentClassName("Office")
//                .setForeignKey("officeId")
//                .build();
//        invoker.execute();
//    }

    public static void single() {
        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("t_gift_goods")
                .setClassName("GiftGoods")
                .build();
        invoker.execute();
    }

}
