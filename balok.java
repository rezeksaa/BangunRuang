package com.mycompany.inheritancebangunruang;

public class balok extends BangunRuang{
    float p;
    float l;
    float t;
    
    @Override
    float volume(){
        float volume = p * l * t;
        System.out.println("Volume Balok: " + volume);
        return volume;
    }
    
    @Override
    float lp(){
        float lp =2 * (p*l + p*t + l*t);
        System.out.println("Luas Permukaan Balok: " + lp);
        return lp;
    }
}
