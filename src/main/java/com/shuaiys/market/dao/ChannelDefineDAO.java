package com.shuaiys.market.dao;

import com.shuaiys.market.dataobject.ChannelDefineDO;
import com.shuaiys.market.dataobject.ChannelDefineDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelDefineDAO {
    long countByExample(ChannelDefineDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ChannelDefineDO record);

    int insertSelective(ChannelDefineDO record);

    List<ChannelDefineDO> selectByExample(ChannelDefineDOExample example);

    ChannelDefineDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ChannelDefineDO record, @Param("example") ChannelDefineDOExample example);

    int updateByExample(@Param("record") ChannelDefineDO record, @Param("example") ChannelDefineDOExample example);

    int updateByPrimaryKeySelective(ChannelDefineDO record);

    int updateByPrimaryKey(ChannelDefineDO record);
}