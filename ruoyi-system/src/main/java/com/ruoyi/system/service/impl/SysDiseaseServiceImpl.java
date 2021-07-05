package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysDiseaseMapper;
import com.ruoyi.system.domain.SysDisease;
import com.ruoyi.system.service.ISysDiseaseService;

/**
 * 病症信息Service业务层处理
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
@Service
public class SysDiseaseServiceImpl implements ISysDiseaseService 
{
    @Autowired
    private SysDiseaseMapper sysDiseaseMapper;

    /**
     * 查询病症信息
     * 
     * @param id 病症信息ID
     * @return 病症信息
     */
    @Override
    public SysDisease selectSysDiseaseById(Long id)
    {
        return sysDiseaseMapper.selectSysDiseaseById(id);
    }

    /**
     * 查询病症信息列表
     * 
     * @param sysDisease 病症信息
     * @return 病症信息
     */
    @Override
    public List<SysDisease> selectSysDiseaseList(SysDisease sysDisease)
    {
        return sysDiseaseMapper.selectSysDiseaseList(sysDisease);
    }

    /**
     * 新增病症信息
     * 
     * @param sysDisease 病症信息
     * @return 结果
     */
    @Override
    public int insertSysDisease(SysDisease sysDisease)
    {
        return sysDiseaseMapper.insertSysDisease(sysDisease);
    }

    /**
     * 修改病症信息
     * 
     * @param sysDisease 病症信息
     * @return 结果
     */
    @Override
    public int updateSysDisease(SysDisease sysDisease)
    {
        return sysDiseaseMapper.updateSysDisease(sysDisease);
    }

    /**
     * 批量删除病症信息
     * 
     * @param ids 需要删除的病症信息ID
     * @return 结果
     */
    @Override
    public int deleteSysDiseaseByIds(Long[] ids)
    {
        return sysDiseaseMapper.deleteSysDiseaseByIds(ids);
    }

    /**
     * 删除病症信息信息
     * 
     * @param id 病症信息ID
     * @return 结果
     */
    @Override
    public int deleteSysDiseaseById(Long id)
    {
        return sysDiseaseMapper.deleteSysDiseaseById(id);
    }
}
