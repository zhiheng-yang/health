package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 病症信息对象 sys_disease
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public class SysDisease extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 病症表 */
    @Excel(name = "病症表")
    private String diseaseTable;

    /** 幼儿名称 */
    @Excel(name = "幼儿名称")
    private String kidName;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdate;

    /** 预计结束天数 */
    @Excel(name = "预计结束天数")
    private Long stopdate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDiseaseTable(String diseaseTable) 
    {
        this.diseaseTable = diseaseTable;
    }

    public String getDiseaseTable() 
    {
        return diseaseTable;
    }
    public void setKidName(String kidName) 
    {
        this.kidName = kidName;
    }

    public String getKidName() 
    {
        return kidName;
    }
    public void setStartdate(Date startdate) 
    {
        this.startdate = startdate;
    }

    public Date getStartdate() 
    {
        return startdate;
    }
    public void setStopdate(Long stopdate) 
    {
        this.stopdate = stopdate;
    }

    public Long getStopdate() 
    {
        return stopdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("diseaseTable", getDiseaseTable())
            .append("kidName", getKidName())
            .append("startdate", getStartdate())
            .append("stopdate", getStopdate())
            .toString();
    }
}
