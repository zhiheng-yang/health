package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 幼儿和班级关联 sys_kid_post
 * 
 * @author ruoyi
 */
public class SysKidPost
{
    /** 用户ID */
    private Long kidId;
    
    /** 岗位ID */
    private Long postId;

    public Long getKidId()
    {
        return kidId;
    }

    public void setKidId(Long kidId)
    {
        this.kidId = kidId;
    }

    public Long getPostId()
    {
        return postId;
    }

    public void setPostId(Long postId)
    {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("kidId", getKidId())
            .append("postId", getPostId())
            .toString();
    }
}
