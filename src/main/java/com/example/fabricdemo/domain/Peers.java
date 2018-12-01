package com.example.fabricdemo.domain;

import lombok.Data;

/**
 * @author gaoyp
 * @create 2018/11/29  18:29
 * Fabric创建的peer信息，包含有cli、org、ca、couchdb等节点服务器关联启动服务信息集合
 **/
@Data
public class Peers {

    private String orgName;
    private String OrgMSPID;
    private String orgDomainName;

}
