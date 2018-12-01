package com.example.fabricdemo.domain;

import lombok.Data;

/**
 * @author gaoyp
 * @create 2018/11/29  18:28
 * Fabric创建的chaincode信息，涵盖所属channel等信息
 **/
@Data
public class Chaincode {

    private String channelName;
    private String chaincodeName;
    private String chaincodePath;
    private String chaincodeVersion;
    private Integer invokeWaitTime = 100000;
    private Integer deployWaitTime = 120000;

}
