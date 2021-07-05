<template>


  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="24">
        <hr />
      </el-col>
    </el-row>

    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>幼儿教育环境智能管理平台</h2>
        <p class="ttpp" >
             教师与家长的沟通效率低下影响了对幼儿教育的总体效果，建立一个幼儿教育智能管理平台，对于教师及家长对幼儿状况的了解具有重要意义。
          本文主要阐述了运用B/S模式设计幼儿教育智能管理平台的思想，
          介绍了现如今比较流行的Web应用技术和Spring Boot框架技术、Java、Vue、MySQL和Maven项目管理技术，
          并以此为理论基础和实践依据，通过Mybaits持久层框架技术，设计并实现了幼儿教育智能管理平台。
          本系统完成了角色管理、用户管理、岗位管理、班级管理、家长及幼儿信息管理、每日表现、每日菜谱等各项功能。
          通过本平台教师及家长可以在相关功能模块看到幼儿的日常表现、健康状况、每日饮食菜谱等信息，及时了解幼儿的在校状态，并通过平台提出反馈意见，
          有效解决了教师与家长沟通难、效率低的情况。管理员则可以通过角色管理、菜单管理等功能对不同角色的用户进行数据权限的设置来进行数据隔离，
          进行菜单权限分配来对用户进行功能的分配，这样不同角色的用户在本平台可使用的功能不相同，
          管理员同样可以在通知公告功能上发布幼儿园的相关信息，便于家长对幼儿园发布的信息更加便捷的查看，极大地方便管理员及教师对于幼儿园的管理。</p>

      </el-col>
    </el-row>
  </div>

</template>

<script>
export default {
  name: "index",
  data() {
    return {
      // 版本号
      version: "3.4.0",
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }
  .ttpp{
    font-size:20px;
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

