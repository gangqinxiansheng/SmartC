package com.cclinux.projects.meetcollege.controller.cust;

import cn.hutool.core.map.MapUtil;
import com.cclinux.framework.annotation.LoginIgnore;
import com.cclinux.framework.core.domain.ApiResult;
import com.cclinux.projects.meetcollege.service.cust.TestService;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Notes: 资讯模块
 * @Author: cclinux0730 (weixin)
 * @Ver: ccminicloud-framework 3.2.1
 */


@RestController("MeetCollegeTestController")
public class TestController extends BaseMyCustController {

    @Resource(name = "MeetCollegeTestService")
    TestService testService;

    @LoginIgnore
    @RequestMapping(value = "/test")
    public ApiResult test(@RequestBody Map<String, Object> input, @RequestAttribute long userId) {


        testService.mockMeetCollege();
        return ApiResult.success(MapUtil.of("msg", "MeetCollege完成"));
    }


}
