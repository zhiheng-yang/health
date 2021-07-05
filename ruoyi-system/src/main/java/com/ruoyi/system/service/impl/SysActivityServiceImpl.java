package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysActivityMapper;
import com.ruoyi.system.domain.SysActivity;
import com.ruoyi.system.service.ISysActivityService;

/**
 * 日常表现Service业务层处理
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
@Service
public class SysActivityServiceImpl implements ISysActivityService 
{
    @Autowired
    private SysActivityMapper sysActivityMapper;

    /**
     * 查询日常表现
     * 
     * @param id 日常表现ID
     * @return 日常表现
     */
    @Override
    public SysActivity selectSysActivityById(Long id)
    {
        return sysActivityMapper.selectSysActivityById(id);
    }

    /**
     * 查询日常表现列表
     * 
     * @param sysActivity 日常表现
     * @return 日常表现
     */
    @Override
    public List<SysActivity> selectSysActivityList(SysActivity sysActivity)
    {
        return sysActivityMapper.selectSysActivityList(sysActivity);
    }

    /**
     * 新增日常表现
     * 
     * @param sysActivity 日常表现
     * @return 结果
     */
    @Override
    public int insertSysActivity(SysActivity sysActivity)
    {
        return sysActivityMapper.insertSysActivity(sysActivity);
    }

    /**
     * 修改日常表现
     * 
     * @param sysActivity 日常表现
     * @return 结果
     */
    @Override
    public int updateSysActivity(SysActivity sysActivity)
    {
        return sysActivityMapper.updateSysActivity(sysActivity);
    }

    /**
     * 批量删除日常表现
     * 
     * @param ids 需要删除的日常表现ID
     * @return 结果
     */
    @Override
    public int deleteSysActivityByIds(Long[] ids)
    {
        return sysActivityMapper.deleteSysActivityByIds(ids);
    }

    /**
     * 删除日常表现信息
     * 
     * @param id 日常表现ID
     * @return 结果
     */
    @Override
    public int deleteSysActivityById(Long id)
    {
        return sysActivityMapper.deleteSysActivityById(id);
    }
}
