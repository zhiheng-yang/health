package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysDisease;

/**
 * 病症信息Service接口
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public interface ISysDiseaseService 
{
    /**
     * 查询病症信息
     * 
     * @param id 病症信息ID
     * @return 病症信息
     */
    public SysDisease selectSysDiseaseById(Long id);

    /**
     * 查询病症信息列表
     * 
     * @param sysDisease 病症信息
     * @return 病症信息集合
     */
    public List<SysDisease> selectSysDiseaseList(SysDisease sysDisease);

    /**
     * 新增病症信息
     * 
     * @param sysDisease 病症信息
     * @return 结果
     */
    public int insertSysDisease(SysDisease sysDisease);

    /**
     * 修改病症信息
     * 
     * @param sysDisease 病症信息
     * @return 结果
     */
    public int updateSysDisease(SysDisease sysDisease);

    /**
     * 批量删除病症信息
     * 
     * @param ids 需要删除的病症信息ID
     * @return 结果
     */
    public int deleteSysDiseaseByIds(Long[] ids);

    /**
     * 删除病症信息信息
     * 
     * @param id 病症信息ID
     * @return 结果
     */
    public int deleteSysDiseaseById(Long id);
}
