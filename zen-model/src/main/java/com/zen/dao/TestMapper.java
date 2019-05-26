package com.zen.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zen.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyaodong
 * @since 2019-05-25
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}
