package com.aleiye.adatav.dao;

import com.aleiye.adatav.entity.DatavInfo;
import com.aleiye.adatav.entity.DatavInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatavInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int countByExample(DatavInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(DatavInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int insert(DatavInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int insertSelective(DatavInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    List<DatavInfo> selectByExample(DatavInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    DatavInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DatavInfo record, @Param("example") DatavInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DatavInfo record, @Param("example") DatavInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DatavInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAV_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DatavInfo record);

    /**
     * 获取菜单权限管理中配置的某大屏
     */
    DatavInfo getClusterAuthDatav(String userId,String id);

    /**
     * 获取菜单权限管理中配置的大屏列表
     */
    List<DatavInfo> getClusterAuthList(String userId);
}