package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysKid;

/**
 * 幼儿信息Mapper接口
 * 
 * @author zhangchao
 * @date 2021-05-18
 */
public interface SysKidMapper 
{
    /**
     * 查询幼儿信息
     * 
     * @param id 幼儿信息ID
     * @return 幼儿信息
     */
    public SysKid selectSysKidById(Long id);

    /**
     * 查询幼儿信息列表
     * 
     * @param sysKid 幼儿信息
     * @return 幼儿信息集合
     */
    public List<SysKid> selectSysKidList(SysKid sysKid);

    /**
     * 新增幼儿信息
     * 
     * @param sysKid 幼儿信息
     * @return 结果
     */
    public int insertSysKid(SysKid sysKid);

    /**
     * 修改幼儿信息
     * 
     * @param sysKid 幼儿信息
     * @return 结果
     */
    public int updateSysKid(SysKid sysKid);

    /**
     * 删除幼儿信息
     * 
     * @param id 幼儿信息ID
     * @return 结果
     */
    public int deleteSysKidById(Long id);

    /**
     * 批量删除幼儿信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysKidByIds(Long[] ids);
}
