package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysParentsMapper;
import com.ruoyi.system.domain.SysParents;
import com.ruoyi.system.service.ISysParentsService;

/**
 * 家长信息Service业务层处理
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
@Service
public class SysParentsServiceImpl implements ISysParentsService 
{
    @Autowired
    private SysParentsMapper sysParentsMapper;

    /**
     * 查询家长信息
     * 
     * @param id 家长信息ID
     * @return 家长信息
     */
    @Override
    public SysParents selectSysParentsById(Long id)
    {
        return sysParentsMapper.selectSysParentsById(id);
    }

    /**
     * 查询家长信息列表
     * 
     * @param sysParents 家长信息
     * @return 家长信息
     */
    @Override
    public List<SysParents> selectSysParentsList(SysParents sysParents)
    {
        return sysParentsMapper.selectSysParentsList(sysParents);
    }

    /**
     * 新增家长信息
     * 
     * @param sysParents 家长信息
     * @return 结果
     */
    @Override
    public int insertSysParents(SysParents sysParents)
    {
        return sysParentsMapper.insertSysParents(sysParents);
    }

    /**
     * 修改家长信息
     * 
     * @param sysParents 家长信息
     * @return 结果
     */
    @Override
    public int updateSysParents(SysParents sysParents)
    {
        return sysParentsMapper.updateSysParents(sysParents);
    }

    /**
     * 批量删除家长信息
     * 
     * @param ids 需要删除的家长信息ID
     * @return 结果
     */
    @Override
    public int deleteSysParentsByIds(Long[] ids)
    {
        return sysParentsMapper.deleteSysParentsByIds(ids);
    }

    /**
     * 删除家长信息信息
     * 
     * @param id 家长信息ID
     * @return 结果
     */
    @Override
    public int deleteSysParentsById(Long id)
    {
        return sysParentsMapper.deleteSysParentsById(id);
    }
}
