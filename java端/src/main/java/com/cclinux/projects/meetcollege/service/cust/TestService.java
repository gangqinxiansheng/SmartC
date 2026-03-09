package com.cclinux.projects.meetcollege.service.cust;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cclinux.framework.core.mapper.UpdateWhere;
import com.cclinux.framework.core.mapper.Where;
import com.cclinux.framework.helper.FakerHelper;
import com.cclinux.framework.helper.TimeHelper;
import com.cclinux.projects.meetcollege.mapper.MeetJoinMapper;
import com.cclinux.projects.meetcollege.mapper.MeetMapper;
import com.cclinux.projects.meetcollege.mapper.NewsMapper;
import com.cclinux.projects.meetcollege.mapper.UserMapper;
import com.cclinux.projects.meetcollege.model.MeetJoinModel;
import com.cclinux.projects.meetcollege.model.MeetModel;
import com.cclinux.projects.meetcollege.model.NewsModel;
import com.cclinux.projects.meetcollege.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Notes: 活动模块业务逻辑
 * @Author: cclinux0730 (weixin)
 * @Ver: ccminicloud-framework 3.2.1
 */

@Service("MeetCollegeTestService")
public class TestService extends BaseMyCustService {

    @Resource(name = "MeetCollegeMeetMapper")
    private MeetMapper meetMapper;

    @Resource(name = "MeetCollegeMeetJoinMapper")
    private MeetJoinMapper meetJoinMapper;

    @Resource(name = "MeetCollegeUserMapper")
    private UserMapper userMapper;

    @Resource(name = "MeetCollegeNewsMapper")
    private NewsMapper newsMapper;


    public void mockMeetCollege() {


    }


}
