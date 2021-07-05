package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.system.domain.SysMeals;
import com.ruoyi.system.service.ISysMealsService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
//import com.ruoyi.system.domain.SysMeals;
//import com.ruoyi.system.service.ISysMealsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 每日菜谱Controller
 *
 * @author zhangchao
 * @date 2021-06-10
 */
@RestController
@RequestMapping("/system/meals")
public class SysMealsController extends BaseController
{
    @Autowired
    private ISysMealsService sysMealsService;

    /**
     * 查询每日菜谱列表
     */
    @PreAuthorize("@ss.hasPermi('system:meals:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysMeals sysMeals)
    {
        startPage();
        List<SysMeals> list = sysMealsService.selectSysMealsList(sysMeals);
        return getDataTable(list);
    }

    /**
     * 导出每日菜谱列表
     */
    @PreAuthorize("@ss.hasPermi('system:meals:export')")
    @Log(title = "每日菜谱", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysMeals sysMeals)
    {
        List<SysMeals> list = sysMealsService.selectSysMealsList(sysMeals);
        ExcelUtil<SysMeals> util = new ExcelUtil<SysMeals>(SysMeals.class);
        return util.exportExcel(list, "每日菜谱数据");
    }

    /**
     * 获取每日菜谱详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:meals:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(sysMealsService.selectSysMealsById(id));
    }

    /**
     * 新增每日菜谱
     */
    @PreAuthorize("@ss.hasPermi('system:meals:add')")
    @Log(title = "每日菜谱", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysMeals sysMeals)
    {
        return toAjax(sysMealsService.insertSysMeals(sysMeals));
    }

    /**
     * 修改每日菜谱
     */
    @PreAuthorize("@ss.hasPermi('system:meals:edit')")
    @Log(title = "每日菜谱", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysMeals sysMeals)
    {
        return toAjax(sysMealsService.updateSysMeals(sysMeals));
    }

    /**
     * 删除每日菜谱
     */
    @PreAuthorize("@ss.hasPermi('system:meals:remove')")
    @Log(title = "每日菜谱", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(sysMealsService.deleteSysMealsByIds(ids));
    }
}
