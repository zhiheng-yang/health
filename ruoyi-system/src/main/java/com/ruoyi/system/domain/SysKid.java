package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 幼儿信息对象 sys_kid
 * 
 * @author zhangchao
 * @date 2021-05-18
 */
public class SysKid extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 幼儿姓名 */
    @Excel(name = "幼儿姓名")
    private String kidName;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 班级 */
    @Excel(name = "班级")
    private Long classId;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String address;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKidName(String kidName) 
    {
        this.kidName = kidName;
    }

    public String getKidName() 
    {
        return kidName;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setClassId(Long classId) 
    {
        this.classId = classId;
    }

    public Long getClassId() 
    {
        return classId;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("kidName", getKidName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("classId", getClassId())
            .append("address", getAddress())
            .append("remark", getRemark())
            .toString();
    }
}
