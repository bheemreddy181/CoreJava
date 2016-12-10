package com.manoharacademy.singletonPattern;

import javax.swing.Action;

public class LearnSingleton {

    public static void main(String[] args) {
        
        Controller controler1 =  Controller.getApplicationController();
        Controller controler2 = Controller.getApplicationController();
        Controller controler3 = Controller.getApplicationController();
        
        if(controler1 == controler2)
            System.out.println("same");
        else
            System.out.println("different");
        
        if(controler1 == controler3)
            System.out.println("same");
        else
            System.out.println("different");
    }

}

class Controller {

    Action a1;
    Action a2;
    Action a3; 
    
    private  static  Controller applicationController = null;

    private Controller() {
    }
    
    public static Controller getApplicationController(){
        //Lazy initialization
        if(applicationController == null)
            applicationController = new Controller();
        
        return applicationController;
    }

}
