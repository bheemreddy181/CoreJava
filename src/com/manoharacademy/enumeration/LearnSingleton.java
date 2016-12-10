package com.manoharacademy.enumeration;

import javax.swing.Action;

public class LearnSingleton {

    public static void main(String[] args) {
        Controller controller1 = Controller.getApplicationController();
        Controller controller2 = Controller.getApplicationController();
        Controller controller3 = Controller.getApplicationController();

        if (controller1 == controller2) {
            System.out.println("controller1 and controller2 are same");
        } else {
            System.out.println("controller1 and controller2 are differnt");
        }

        if (controller1 == controller3) {
            System.out.println("controller1 and controller3 are same");
        } else {
            System.out.println("controller1 and controller3 are differnt");
        }
    }

}

class Controller {

    Action a1;
    Action a2;
    Action a3;

    public static final Controller applicationController = new Controller();

    private Controller() {
    }

    public static Controller getApplicationController() {
        return applicationController;
    }
}
