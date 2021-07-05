package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 家长信息对象 sys_parents
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public class SysParents extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Long id;

    /** 家长姓名 */
    @Excel(name = "家长姓名")
    private String parentName;

    /** 密码 */
    private String password;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 幼儿ID */
    @Excel(name = "幼儿ID")
    private String kidId;

    /** 关系 */
    @Excel(name = "关系")
    private String relation;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 微信 */
    @Excel(name = "微信")
    private String wechat;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setParentName(String parentName) 
    {
        this.parentName = parentName;
    }

    public String getParentName() 
    {
        return parentName;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setKidId(String kidId) 
    {
        this.kidId = kidId;
    }

    public String getKidId() 
    {
        return kidId;
    }
    public void setRelation(String relation) 
    {
        this.relation = relation;
    }

    public String getRelation() 
    {
        return relation;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setWechat(String wechat) 
    {
        this.wechat = wechat;
    }

    public String getWechat() 
    {
        return wechat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("parentName", getParentName())
            .append("password", getPassword())
            .append("sex", getSex())
            .append("kidId", getKidId())
            .append("relation", getRelation())
            .append("phone", getPhone())
            .append("wechat", getWechat())
            .append("remark", getRemark())
            .toString();
    }
}
