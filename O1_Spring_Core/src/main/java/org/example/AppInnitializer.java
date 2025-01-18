package org.example;

import org.example.bean.*;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInnitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Object bean = context.getBean("springBean");
//        System.out.println(bean);
//
//        TestBean1 testBean1 = context.getBean(TestBean1.class);
//        System.out.println(testBean1);
//
//        TestBean2 testBean2 = context.getBean(TestBean2.class);
//        System.out.println(testBean2);



//        //bean ekk request krnn plwn pahatha akr wlt

//        Object bean = context.getBean("bean");  // nama dila plwn
//        System.out.println(bean);
//
//        TestBean1 testBean1 = (TestBean1)context.getBean("testBean1");
//        System.out.println(testBean1);  // namai class eki dekm dil oln
//
//        TestBean2 testBean2 = context.getBean("testBean2",TestBean2.class);
//        System.out.println(testBean2);



//        manually nathuwa auto shutdown krnn plwn
        context.registerShutdownHook();


        // jvm eke thread ekk allala thama shut down wenne

//
//        Runtime.getRuntime().addShutdownHook(new Thread() {   // jvm ek shut down wen welawe thma cliase kre me manually allgtte
//            public void run() {
//                System.out.println("Shutting Down");
//                context.close();
//            }
//        });


        // ape nowana class ekkin object ekk hdpu ek
//        MyConnection connection=  context.getBean(MyConnection.class);
//        System.out.println(connection);

        //3rd party ekekm ememethod eke tyn nama dnn oni
//        MyConnection myConnection= (MyConnection) context.getBean("getConnection");//3rd party ekekm ememethod eke tyn nama dnn oni
//        System.out.println(myConnection);


//
//        TestBean3 testBean3 = context.getBean(TestBean3.class);
//        System.out.println(testBean3);



        //ref kyn ekn by defaukt siglton behaviour ekk enwa ek nisa mehem krhm 3 prk object create wen na , ekam repaet wenne
        TestBean1 ref1= context.getBean(TestBean1.class);
       System.out.println(ref1);

        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);

        TestBean1 ref3 = context.getBean(TestBean1.class);
        System.out.println(ref3);

        MyConnection ref4 =  context.getBean(MyConnection.class);
           System.out.println(ref4);


        MyConnection ref5 =  context.getBean(MyConnection.class);
        System.out.println(ref5);

    }
}