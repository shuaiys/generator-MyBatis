package com.shuaiys.parameter.dao;

import com.shuaiys.parameter.dataobject.ParameterDO;
import com.shuaiys.parameter.dataobject.ParameterDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterDAO {
    long countByExample(ParameterDOExample example);

    int deleteByExample(ParameterDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ParameterDO record);

    int insertSelective(ParameterDO record);

    List<ParameterDO> selectByExample(ParameterDOExample example);

    ParameterDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ParameterDO record, @Param("example") ParameterDOExample example);

    int updateByExample(@Param("record") ParameterDO record, @Param("example") ParameterDOExample example);

    int updateByPrimaryKeySelective(ParameterDO record);

    int updateByPrimaryKey(ParameterDO record);
}