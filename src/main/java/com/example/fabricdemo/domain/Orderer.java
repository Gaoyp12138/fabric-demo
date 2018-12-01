package com.example.fabricdemo.domain;

import lombok.Data;

/**
 * @author gaoyp
 * @create 2018/11/30  16:28
 **/
@Data
public class Orderer {

    private String ordererName;
    private String ordererLocation;

    public Orderer(String ordererName, String ordererLocation) {
        this.ordererName = ordererName;
        this.ordererLocation = ordererLocation;
    }
}
