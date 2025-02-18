package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;

@Component
public class Boy implements Agreement {
@Autowired
@Qualifier("girl1")  // prmary annotation ek mulitiple gdk use w=krl tyenwnm eken  mkkd thorgnne oni kiyl hygnnw e madi ekt bean  eke id ek dnn oni

  Agreement girl;
     public Boy(){
         System.out.println("Boy Constructor");

     }

     //tight coupling
//     public void chatWithGirl(){
//        Girl girl = new Girl();
//        girl.chat();
//    }

   public void chatWithGirl(){
    girl.chat();
   }
}
