import request from '@/utils/request'

// 查询幼儿信息列表
export function listKid(query) {
  return request({
    url: '/system/kid/list',
    method: 'get',
    params: query
  })
}

// 查询幼儿信息详细
export function getKid(id) {
  return request({
    url: '/system/kid/' + id,
    method: 'get'
  })
}

// 新增幼儿信息
export function addKid(data) {
  return request({
    url: '/system/kid',
    method: 'post',
    data: data
  })
}

// 修改幼儿信息
export function updateKid(data) {
  return request({
    url: '/system/kid',
    method: 'put',
    data: data
  })
}

// 删除幼儿信息
export function delKid(id) {
  return request({
    url: '/system/kid/' + id,
    method: 'delete'
  })
}

// 导出幼儿信息
export function exportKid(query) {
  return request({
    url: '/system/kid/export',
    method: 'get',
    params: query
  })
}