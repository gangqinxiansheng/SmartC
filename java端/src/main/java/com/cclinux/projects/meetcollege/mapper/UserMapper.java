package com.cclinux.projects.meetcollege.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetcollege.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetCollegeUserMapper")
@Mapper
public interface UserMapper extends ProjectBaseMapper<UserModel> {
}
