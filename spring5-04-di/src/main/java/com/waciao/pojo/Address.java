package com.waciao.pojo;

/**
 * @author: Waciao
 * @Date: 2020/3/25
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
