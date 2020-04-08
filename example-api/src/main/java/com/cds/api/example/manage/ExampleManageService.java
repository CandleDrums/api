/**
 * @Project example-server-api
 * @Package com.cd.api.example.manage
 * @Class ExampleManageService.java
 * @Date Dec 21, 2019 5:02:08 PM
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.manage;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.ExampleVO;
import com.cds.base.api.service.GeneralManageService;
import com.cds.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Description 示例管理Service
 * @Notes 未填写备注
 * @author liming
 * @Date Dec 21, 2019 4:43:48 PM
 */
@Api(value = "示例管理(ExampleManageService)", tags = {"示例管理"})
@FeignClient(name = APIConstants.APP_NAME)
public interface ExampleManageService extends GeneralManageService<ExampleVO> {
    // 前缀
    static final String PREFIX = BASE_PREFIX + "/ExampleManageService";

    @Override
    @ApiOperation(value = "删除")
    @PostMapping(PREFIX + "/delete")
    ResponseResult<Boolean> delete(@RequestParam(value = "num", required = true) @NotNull String num);

    @Override
    @ApiOperation(value = "添加")
    @PostMapping(PREFIX + "/add")
    ResponseResult<ExampleVO> add(@RequestBody @NotNull ExampleVO example);

    @Override
    @ApiOperation(value = "修改")
    @PostMapping(PREFIX + "/modify")
    ResponseResult<ExampleVO> modify(@RequestBody @NotNull ExampleVO example);

}
