package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysKidMapper;
import com.ruoyi.system.domain.SysKid;
import com.ruoyi.system.service.ISysKidService;

/**
 * 幼儿信息Service业务层处理
 * 
 * @author zhangchao
 * @date 2021-05-18
 */
@Service
public class SysKidServiceImpl implements ISysKidService 
{
    @Autowired
    private SysKidMapper sysKidMapper;

    /**
     * 查询幼儿信息
     * 
     * @param id 幼儿信息ID
     * @return 幼儿信息
     */
    @Override
    public SysKid selectSysKidById(Long id)
    {
        return sysKidMapper.selectSysKidById(id);
    }

    /**
     * 查询幼儿信息列表
     * 
     * @param sysKid 幼儿信息
     * @return 幼儿信息
     */
    @Override
    public List<SysKid> selectSysKidList(SysKid sysKid)
    {
        return sysKidMapper.selectSysKidList(sysKid);
    }

    /**
     * 新增幼儿信息
     * 
     * @param sysKid 幼儿信息
     * @return 结果
     */
    @Override
    public int insertSysKid(SysKid sysKid)
    {
        return sysKidMapper.insertSysKid(sysKid);
    }

    /**
     * 修改幼儿信息
     * 
     * @param sysKid 幼儿信息
     * @return 结果
     */
    @Override
    public int updateSysKid(SysKid sysKid)
    {
        return sysKidMapper.updateSysKid(sysKid);
    }

    /**
     * 批量删除幼儿信息
     * 
     * @param ids 需要删除的幼儿信息ID
     * @return 结果
     */
    @Override
    public int deleteSysKidByIds(Long[] ids)
    {
        return sysKidMapper.deleteSysKidByIds(ids);
    }

    /**
     * 删除幼儿信息信息
     * 
     * @param id 幼儿信息ID
     * @return 结果
     */
    @Override
    public int deleteSysKidById(Long id)
    {
        return sysKidMapper.deleteSysKidById(id);
    }
}
