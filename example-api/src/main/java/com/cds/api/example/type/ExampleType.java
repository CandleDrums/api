/**
 * @Project example-server-api
 * @Package com.cd.api.example.type
 * @Class ExampleType.java
 * @Date Dec 21, 2019 4:58:53 PM
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.type;

/**
 * @Description 示例类型
 * @Notes 未填写备注
 * @author liming
 * @Date Dec 21, 2019 4:58:53 PM
 */
public enum ExampleType {
    EXAMPLE_TYPE("EXAMPLE_TYPE", "示例类型");

    // 值
    private final String value;
    // 意
    private String desc;

    private ExampleType(String value, String desc) {
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
