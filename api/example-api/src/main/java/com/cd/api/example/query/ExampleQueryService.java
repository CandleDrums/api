/**
 * @Project example-server-api
 * @Package com.cd.api.example.query
 * @Class ExampleQueryService.java
 * @Date Dec 21, 2019 5:03:06 PM
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cd.api.example.query;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cd.api.example.constant.APIConstants;
import com.cd.api.example.model.ExampleVO;
import com.cd.base.api.service.GeneralQueryService;
import com.cd.base.common.page.Page;
import com.cd.base.common.page.PageResult;
import com.cd.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Description 示例查询Service
 * @Notes 未填写备注
 * @author liming
 * @Date Dec 21, 2019 5:03:06 PM
 */
@Api(value = "示例查询(ExampleQueryService)", tags = {"示例查询"})
@FeignClient(name = APIConstants.APP_NAME)
public interface ExampleQueryService extends GeneralQueryService<ExampleVO> {

    // 前缀
    static final String PREFIX = BASE_PREFIX + "/ExampleQueryService";

    @Override
    @ApiOperation(value = "是否存在")
    @PostMapping(PREFIX + "/contains")
    ResponseResult<Boolean> contains(@RequestBody @NotNull ExampleVO example);

    @Override
    @ApiOperation(value = "详情")
    @PostMapping(PREFIX + "/detail")
    ResponseResult<ExampleVO> detail(@RequestParam(value = "num", required = true) @NotNull String num);

    @Override
    @ApiOperation(value = "指定条件查询")
    @PostMapping(PREFIX + "/queryAll")
    ResponseResult<List<ExampleVO>> queryAll(@RequestBody @NotNull ExampleVO example);

    @Override
    @ApiOperation(value = "分页查询")
    @PostMapping(PREFIX + "/queryPagingList")
    ResponseResult<PageResult<ExampleVO>> queryPagingList(@RequestBody @NotNull Page<ExampleVO> examplePage);

}
