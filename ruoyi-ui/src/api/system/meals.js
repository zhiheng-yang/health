import request from '@/utils/request'

// 查询每日菜谱列表
export function listMeals(query) {
  return request({
    url: '/system/meals/list',
    method: 'get',
    params: query
  })
}

// 查询每日菜谱详细
export function getMeals(id) {
  return request({
    url: '/system/meals/' + id,
    method: 'get'
  })
}

// 新增每日菜谱
export function addMeals(data) {
  return request({
    url: '/system/meals',
    method: 'post',
    data: data
  })
}

// 修改每日菜谱
export function updateMeals(data) {
  return request({
    url: '/system/meals',
    method: 'put',
    data: data
  })
}

// 删除每日菜谱
export function delMeals(id) {
  return request({
    url: '/system/meals/' + id,
    method: 'delete'
  })
}

// 导出每日菜谱
export function exportMeals(query) {
  return request({
    url: '/system/meals/export',
    method: 'get',
    params: query
  })
}