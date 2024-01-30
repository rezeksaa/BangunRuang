package com.mycompany.inheritancebangunruang;

public class Bola extends BangunRuang{
    float r;
    
    @Override
    float volume(){
        float volume = 4 * 22 * r * r * r / 3 / 7;
        System.out.println("Volume Bola: " + volume);
        return volume;
    }
    @Override
    float lp(){
        float lp = 4 * 22 * r * r / 7;
        System.out.println("Luas Permukaan Bola: " + lp);
        return lp;
    }
}
