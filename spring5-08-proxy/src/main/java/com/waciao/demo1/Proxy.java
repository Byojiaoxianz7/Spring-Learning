package com.waciao.demo1;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 13:38
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class Proxy {

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    // 收中介费
    private void fare() {
        System.out.println("收中介费");
    }

    // 签合同
    private void hetong() {
        System.out.println("签合同");
    }

    // 看房
    private void seeHouse() {
        System.out.println("看房");
    }
}
