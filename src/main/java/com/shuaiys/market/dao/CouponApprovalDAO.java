package com.shuaiys.market.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponApprovalDAO {
    long countByExample(CouponApprovalDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CouponApprovalDO record);

    int insertSelective(CouponApprovalDO record);

    List<CouponApprovalDO> selectByExample(CouponApprovalDOExample example);

    CouponApprovalDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CouponApprovalDO record, @Param("example") CouponApprovalDOExample example);

    int updateByExample(@Param("record") CouponApprovalDO record, @Param("example") CouponApprovalDOExample example);

    int updateByPrimaryKeySelective(CouponApprovalDO record);

    int updateByPrimaryKey(CouponApprovalDO record);
}