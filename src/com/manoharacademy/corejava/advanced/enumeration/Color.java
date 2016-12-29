package com.manoharacademy.corejava.advanced.enumeration;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

enum Color implements MouseListener, Runnable{
    
    RED("RED",255,0,0),
    GREEN("GREEN",0,255,0),
    BLUE("BLUE",0,0,255),
    WHITE("WHITE",255,255,255),
    BLACK("BLACK",0,0,0);

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String colorName;
    private int r;
    private int g;
    private int b;
    

    private Color(String colorName, int r, int g, int b) {
        this.colorName = colorName;
        this.r = r;
        this.g = g;
        this.b = b;
        
        System.out.println("Constructor called for :: "+"Color{" + "colorName=" + colorName + ", r=" + r + ", g=" + g + ", b=" + b + '}');
        
    }

    public String getColorName() {
        return colorName;
    }

    @Override
    public String toString() {
        return "Color{" + "colorName=" + colorName + ", r=" + r + ", g=" + g + ", b=" + b + '}';
    }

}
