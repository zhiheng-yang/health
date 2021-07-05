package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysMeals;

/**
 * 每日菜谱Mapper接口
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
public interface SysMealsMapper 
{
    /**
     * 查询每日菜谱
     * 
     * @param id 每日菜谱ID
     * @return 每日菜谱
     */
    public SysMeals selectSysMealsById(String id);

    /**
     * 查询每日菜谱列表
     * 
     * @param sysMeals 每日菜谱
     * @return 每日菜谱集合
     */
    public List<SysMeals> selectSysMealsList(SysMeals sysMeals);

    /**
     * 新增每日菜谱
     * 
     * @param sysMeals 每日菜谱
     * @return 结果
     */
    public int insertSysMeals(SysMeals sysMeals);

    /**
     * 修改每日菜谱
     * 
     * @param sysMeals 每日菜谱
     * @return 结果
     */
    public int updateSysMeals(SysMeals sysMeals);

    /**
     * 删除每日菜谱
     * 
     * @param id 每日菜谱ID
     * @return 结果
     */
    public int deleteSysMealsById(String id);

    /**
     * 批量删除每日菜谱
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysMealsByIds(String[] ids);
}
