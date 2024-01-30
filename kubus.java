package com.mycompany.inheritancebangunruang;

public class kubus extends BangunRuang{
         float s;
    
         @Override
    float volume(){
        float volume = s * s * s;
        System.out.println("Volume kubus: " + volume);
        return volume;
    }
    
         @Override
    float lp(){
        float lp = 6 * s * s;
        System.out.println("Luas Permukaan kubus: " + lp);
        return lp;
    }
}
