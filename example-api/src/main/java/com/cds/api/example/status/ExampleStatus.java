/**
 * @Project example-server-api
 * @Package com.cd.api.example.status
 * @Class ExampleStatus.java
 * @Date Dec 21, 2019 4:56:16 PM
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.status;

/**
 * @Description 示例状态
 * @Notes 未填写备注
 * @author liming
 * @Date Dec 21, 2019 4:56:16 PM
 */
public enum ExampleStatus {
    EXAMPLE_STATUS("EXAMPLE_STATUS", "示例状态");

    // 值
    private final String value;
    // 意
    private String desc;

    private ExampleStatus(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

}
