package com.cclinux.projects.meetcollege.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetcollege.model.FavModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetCollegeFavMapper")
@Mapper
public interface FavMapper extends ProjectBaseMapper<FavModel> {
}
