package com.waciao.demo1;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 13:38
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class Client {
    public static void main(String[] args) {
        // 房东出租房子
        Host host = new Host();
        // 代理, 中介帮房东出租房子,但是中介会有一些骚操作
        Proxy proxy = new Proxy(host);
        // 租房子不用找房东,直接找中介即可
        proxy.rent();
    }
}
