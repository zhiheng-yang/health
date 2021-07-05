package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysActivity;

/**
 * 日常表现Mapper接口
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public interface SysActivityMapper 
{
    /**
     * 查询日常表现
     * 
     * @param id 日常表现ID
     * @return 日常表现
     */
    public SysActivity selectSysActivityById(Long id);

    /**
     * 查询日常表现列表
     * 
     * @param sysActivity 日常表现
     * @return 日常表现集合
     */
    public List<SysActivity> selectSysActivityList(SysActivity sysActivity);

    /**
     * 新增日常表现
     * 
     * @param sysActivity 日常表现
     * @return 结果
     */
    public int insertSysActivity(SysActivity sysActivity);

    /**
     * 修改日常表现
     * 
     * @param sysActivity 日常表现
     * @return 结果
     */
    public int updateSysActivity(SysActivity sysActivity);

    /**
     * 删除日常表现
     * 
     * @param id 日常表现ID
     * @return 结果
     */
    public int deleteSysActivityById(Long id);

    /**
     * 批量删除日常表现
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysActivityByIds(Long[] ids);
}
