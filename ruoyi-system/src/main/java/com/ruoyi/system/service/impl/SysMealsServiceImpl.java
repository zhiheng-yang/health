package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysMealsMapper;
import com.ruoyi.system.domain.SysMeals;
import com.ruoyi.system.service.ISysMealsService;

/**
 * 每日菜谱Service业务层处理
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
@Service
public class SysMealsServiceImpl implements ISysMealsService 
{
    @Autowired
    private SysMealsMapper sysMealsMapper;

    /**
     * 查询每日菜谱
     * 
     * @param id 每日菜谱ID
     * @return 每日菜谱
     */
    @Override
    public SysMeals selectSysMealsById(String id)
    {
        return sysMealsMapper.selectSysMealsById(id);
    }

    /**
     * 查询每日菜谱列表
     * 
     * @param sysMeals 每日菜谱
     * @return 每日菜谱
     */
    @Override
    public List<SysMeals> selectSysMealsList(SysMeals sysMeals)
    {
        return sysMealsMapper.selectSysMealsList(sysMeals);
    }

    /**
     * 新增每日菜谱
     * 
     * @param sysMeals 每日菜谱
     * @return 结果
     */
    @Override
    public int insertSysMeals(SysMeals sysMeals)
    {
        return sysMealsMapper.insertSysMeals(sysMeals);
    }

    /**
     * 修改每日菜谱
     * 
     * @param sysMeals 每日菜谱
     * @return 结果
     */
    @Override
    public int updateSysMeals(SysMeals sysMeals)
    {
        return sysMealsMapper.updateSysMeals(sysMeals);
    }

    /**
     * 批量删除每日菜谱
     * 
     * @param ids 需要删除的每日菜谱ID
     * @return 结果
     */
    @Override
    public int deleteSysMealsByIds(String[] ids)
    {
        return sysMealsMapper.deleteSysMealsByIds(ids);
    }

    /**
     * 删除每日菜谱信息
     * 
     * @param id 每日菜谱ID
     * @return 结果
     */
    @Override
    public int deleteSysMealsById(String id)
    {
        return sysMealsMapper.deleteSysMealsById(id);
    }
}
