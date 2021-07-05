package com.ruoyi.web.controller.system;

import java.util.List;
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
import com.ruoyi.system.domain.SysActivity;
import com.ruoyi.system.service.ISysActivityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 日常表现Controller
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
@RestController
@RequestMapping("/system/activity")
public class SysActivityController extends BaseController
{
    @Autowired
    private ISysActivityService sysActivityService;

    /**
     * 查询日常表现列表
     */
    @PreAuthorize("@ss.hasPermi('system:activity:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysActivity sysActivity)
    {
        startPage();
        List<SysActivity> list = sysActivityService.selectSysActivityList(sysActivity);
        return getDataTable(list);
    }

    /**
     * 导出日常表现列表
     */
    @PreAuthorize("@ss.hasPermi('system:activity:export')")
    @Log(title = "日常表现", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysActivity sysActivity)
    {
        List<SysActivity> list = sysActivityService.selectSysActivityList(sysActivity);
        ExcelUtil<SysActivity> util = new ExcelUtil<SysActivity>(SysActivity.class);
        return util.exportExcel(list, "日常表现数据");
    }

    /**
     * 获取日常表现详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:activity:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysActivityService.selectSysActivityById(id));
    }

    /**
     * 新增日常表现
     */
    @PreAuthorize("@ss.hasPermi('system:activity:add')")
    @Log(title = "日常表现", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysActivity sysActivity)
    {
        return toAjax(sysActivityService.insertSysActivity(sysActivity));
    }

    /**
     * 修改日常表现
     */
    @PreAuthorize("@ss.hasPermi('system:activity:edit')")
    @Log(title = "日常表现", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysActivity sysActivity)
    {
        return toAjax(sysActivityService.updateSysActivity(sysActivity));
    }

    /**
     * 删除日常表现
     */
    @PreAuthorize("@ss.hasPermi('system:activity:remove')")
    @Log(title = "日常表现", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysActivityService.deleteSysActivityByIds(ids));
    }
}
