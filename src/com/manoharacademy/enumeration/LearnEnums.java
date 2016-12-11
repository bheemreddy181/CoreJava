package com.manoharacademy.enumeration;

public class LearnEnums {

    public static void main(String[] args) throws Exception {

        Color redColor = Color.RED;
        Color greenColor = Color.GREEN;
        Color BlueColor = Color.BLUE;
        Color whiteColor = Color.WHITE;
        Color blackColor = Color.BLACK;
        
        Color redColor2 = Enum.valueOf(Color.class, "RED");
        Color redColor3 = Color.valueOf("RED");
        
        if( redColor == redColor2 & redColor2 == redColor3)
            System.out.println("Same");

        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }

}
