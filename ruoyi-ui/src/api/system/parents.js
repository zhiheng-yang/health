import request from '@/utils/request'

// 查询家长信息列表
export function listParents(query) {
  return request({
    url: '/system/parents/list',
    method: 'get',
    params: query
  })
}

// 查询家长信息详细
export function getParents(id) {
  return request({
    url: '/system/parents/' + id,
    method: 'get'
  })
}

// 新增家长信息
export function addParents(data) {
  return request({
    url: '/system/parents',
    method: 'post',
    data: data
  })
}

// 修改家长信息
export function updateParents(data) {
  return request({
    url: '/system/parents',
    method: 'put',
    data: data
  })
}

// 删除家长信息
export function delParents(id) {
  return request({
    url: '/system/parents/' + id,
    method: 'delete'
  })
}

// 导出家长信息
export function exportParents(query) {
  return request({
    url: '/system/parents/export',
    method: 'get',
    params: query
  })
}