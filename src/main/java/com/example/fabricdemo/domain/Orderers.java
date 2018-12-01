package com.example.fabricdemo.domain;

import lombok.Data;
import com.example.fabricdemo.domain.Orderer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoyp
 * @create 2018/11/29  18:28
 * Fabric创建的orderer信息，涵盖单机和集群两种方案
 **/
@Data
public class Orderers {

    private String ordererDomainName;

    private List<Orderer> orderers = new ArrayList<>();


    private void addOrderer(String name, String location){
        orderers.add(new Orderer(name,location));
    }

    private List<Orderer> get(){
        return orderers;
    }
}
