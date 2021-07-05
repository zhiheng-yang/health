package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 日常表现对象 sys_activity
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public class SysActivity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 学生ID */
    @Excel(name = "学生ID")
    private String kidName;

    /** 评价 */
    @Excel(name = "评价")
    private String evaluation;

    /** 活动 */
    @Excel(name = "活动")
    private String activity;

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
    public void setEvaluation(String evaluation) 
    {
        this.evaluation = evaluation;
    }

    public String getEvaluation() 
    {
        return evaluation;
    }
    public void setActivity(String activity) 
    {
        this.activity = activity;
    }

    public String getActivity() 
    {
        return activity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("kidName", getKidName())
            .append("evaluation", getEvaluation())
            .append("activity", getActivity())
            .append("remark", getRemark())
            .toString();
    }
}
