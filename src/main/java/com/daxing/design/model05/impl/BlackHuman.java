package com.daxing.design.model05.impl;

import com.daxing.design.model05.Human;

public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑色人类会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑色人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑色人类会说");
    }
}
