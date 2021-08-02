package com.aleiye.adatav.entity;

public class DatavFolder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAV_FOLDER.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAV_FOLDER.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAV_FOLDER.DESCR
     *
     * @mbggenerated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAV_FOLDER.OWNER_ID
     *
     * @mbggenerated
     */
    private String ownerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAV_FOLDER.CREATE_TIME
     *
     * @mbggenerated
     */
    private Long createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAV_FOLDER.MODIFY_TIME
     *
     * @mbggenerated
     */
    private Long modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAV_FOLDER.STATUS
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAV_FOLDER.ID
     *
     * @return the value of DATAV_FOLDER.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAV_FOLDER.ID
     *
     * @param id the value for DATAV_FOLDER.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAV_FOLDER.NAME
     *
     * @return the value of DATAV_FOLDER.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAV_FOLDER.NAME
     *
     * @param name the value for DATAV_FOLDER.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAV_FOLDER.DESCR
     *
     * @return the value of DATAV_FOLDER.DESCR
     *
     * @mbggenerated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAV_FOLDER.DESCR
     *
     * @param descr the value for DATAV_FOLDER.DESCR
     *
     * @mbggenerated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAV_FOLDER.OWNER_ID
     *
     * @return the value of DATAV_FOLDER.OWNER_ID
     *
     * @mbggenerated
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAV_FOLDER.OWNER_ID
     *
     * @param ownerId the value for DATAV_FOLDER.OWNER_ID
     *
     * @mbggenerated
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAV_FOLDER.CREATE_TIME
     *
     * @return the value of DATAV_FOLDER.CREATE_TIME
     *
     * @mbggenerated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAV_FOLDER.CREATE_TIME
     *
     * @param createTime the value for DATAV_FOLDER.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAV_FOLDER.MODIFY_TIME
     *
     * @return the value of DATAV_FOLDER.MODIFY_TIME
     *
     * @mbggenerated
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAV_FOLDER.MODIFY_TIME
     *
     * @param modifyTime the value for DATAV_FOLDER.MODIFY_TIME
     *
     * @mbggenerated
     */
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAV_FOLDER.STATUS
     *
     * @return the value of DATAV_FOLDER.STATUS
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAV_FOLDER.STATUS
     *
     * @param status the value for DATAV_FOLDER.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}