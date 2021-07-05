package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysParents;

/**
 * 家长信息Mapper接口
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public interface SysParentsMapper 
{
    /**
     * 查询家长信息
     * 
     * @param id 家长信息ID
     * @return 家长信息
     */
    public SysParents selectSysParentsById(Long id);

    /**
     * 查询家长信息列表
     * 
     * @param sysParents 家长信息
     * @return 家长信息集合
     */
    public List<SysParents> selectSysParentsList(SysParents sysParents);

    /**
     * 新增家长信息
     * 
     * @param sysParents 家长信息
     * @return 结果
     */
    public int insertSysParents(SysParents sysParents);

    /**
     * 修改家长信息
     * 
     * @param sysParents 家长信息
     * @return 结果
     */
    public int updateSysParents(SysParents sysParents);

    /**
     * 删除家长信息
     * 
     * @param id 家长信息ID
     * @return 结果
     */
    public int deleteSysParentsById(Long id);

    /**
     * 批量删除家长信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysParentsByIds(Long[] ids);
}
