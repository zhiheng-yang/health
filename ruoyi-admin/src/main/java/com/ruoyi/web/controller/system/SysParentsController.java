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
import com.ruoyi.system.domain.SysParents;
import com.ruoyi.system.service.ISysParentsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 家长信息Controller
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
@RestController
@RequestMapping("/system/parents")
public class SysParentsController extends BaseController
{
    @Autowired
    private ISysParentsService sysParentsService;

    /**
     * 查询家长信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:parents:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysParents sysParents)
    {
        startPage();
        List<SysParents> list = sysParentsService.selectSysParentsList(sysParents);
        return getDataTable(list);
    }

    /**
     * 导出家长信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:parents:export')")
    @Log(title = "家长信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysParents sysParents)
    {
        List<SysParents> list = sysParentsService.selectSysParentsList(sysParents);
        ExcelUtil<SysParents> util = new ExcelUtil<SysParents>(SysParents.class);
        return util.exportExcel(list, "家长信息数据");
    }

    /**
     * 获取家长信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:parents:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysParentsService.selectSysParentsById(id));
    }

    /**
     * 新增家长信息
     */
    @PreAuthorize("@ss.hasPermi('system:parents:add')")
    @Log(title = "家长信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysParents sysParents)
    {
        return toAjax(sysParentsService.insertSysParents(sysParents));
    }

    /**
     * 修改家长信息
     */
    @PreAuthorize("@ss.hasPermi('system:parents:edit')")
    @Log(title = "家长信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysParents sysParents)
    {
        return toAjax(sysParentsService.updateSysParents(sysParents));
    }

    /**
     * 删除家长信息
     */
    @PreAuthorize("@ss.hasPermi('system:parents:remove')")
    @Log(title = "家长信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysParentsService.deleteSysParentsByIds(ids));
    }
}
