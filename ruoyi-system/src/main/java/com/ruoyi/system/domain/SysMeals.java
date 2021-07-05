package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 每日菜谱对象 sys_meals
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public class SysMeals extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private String id;

    /** 班级 */
    @Excel(name = "班级")
    private Long deptId;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 早餐 */
    @Excel(name = "早餐")
    private String breakfast;

    /** 午餐 */
    @Excel(name = "午餐")
    private String lunch;

    /** 晚餐 */
    @Excel(name = "晚餐")
    private String dinner;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setBreakfast(String breakfast) 
    {
        this.breakfast = breakfast;
    }

    public String getBreakfast() 
    {
        return breakfast;
    }
    public void setLunch(String lunch) 
    {
        this.lunch = lunch;
    }

    public String getLunch() 
    {
        return lunch;
    }
    public void setDinner(String dinner) 
    {
        this.dinner = dinner;
    }

    public String getDinner() 
    {
        return dinner;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deptId", getDeptId())
            .append("date", getDate())
            .append("breakfast", getBreakfast())
            .append("lunch", getLunch())
            .append("dinner", getDinner())
            .append("remark", getRemark())
            .toString();
    }
}
