package com.bowen.dao.mapper.gen;

import com.bowen.dao.model.gen.MerchantConfig;
import com.bowen.dao.model.gen.MerchantConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MerchantConfigMapper {
    long countByExample(MerchantConfigExample example);

    int deleteByExample(MerchantConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MerchantConfig record);

    int insertSelective(MerchantConfig record);

    List<MerchantConfig> selectByExampleWithRowbounds(MerchantConfigExample example, RowBounds rowBounds);

    List<MerchantConfig> selectByExample(MerchantConfigExample example);

    MerchantConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MerchantConfig record, @Param("example") MerchantConfigExample example);

    int updateByExample(@Param("record") MerchantConfig record, @Param("example") MerchantConfigExample example);

    int updateByPrimaryKeySelective(MerchantConfig record);

    int updateByPrimaryKey(MerchantConfig record);
}