import request from '@/utils/request'

// 查询病症信息列表
export function listDisease(query) {
  return request({
    url: '/system/disease/list',
    method: 'get',
    params: query
  })
}

// 查询病症信息详细
export function getDisease(id) {
  return request({
    url: '/system/disease/' + id,
    method: 'get'
  })
}

// 新增病症信息
export function addDisease(data) {
  return request({
    url: '/system/disease',
    method: 'post',
    data: data
  })
}

// 修改病症信息
export function updateDisease(data) {
  return request({
    url: '/system/disease',
    method: 'put',
    data: data
  })
}

// 删除病症信息
export function delDisease(id) {
  return request({
    url: '/system/disease/' + id,
    method: 'delete'
  })
}

// 导出病症信息
export function exportDisease(query) {
  return request({
    url: '/system/disease/export',
    method: 'get',
    params: query
  })
}