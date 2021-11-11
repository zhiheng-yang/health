<template>


  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="24">
        <hr />
      </el-col>
    </el-row>

    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>产能共享平台</h2>
        <div class="echarts">
          <div :id="map" :style="{height:'450px',width:'130%'}" ref="myEchart"></div>
<!--          <div :class="className" :id="id" :style="{height:height,width:width}" ref="myEchart2"></div>-->
        </div>
      </el-col>
    </el-row>
  </div>

</template>

<script>
import echarts from "echarts";
//   import '../../node_modules/echarts/map/js/world.js'
import '../../node_modules/echarts/map/js/china.js' // 引入中国地图数据
import '../../node_modules/echarts/map/js/world.js'

export default {
  // regionOptions;
  // data = [
  //   {province: '山东', name: '济南', percent: '100', num: '120' },
  //   {province: '山东', name: '淄博', percent: '90', num: '110' },
  //   {province: '山东', name: '潍坊', percent: '80', num: '90' },
  //   {province: '山东', name: '威海', percent: '80', num: '90' },
  //   {province: '山东', name: '青岛', percent: '90', num: '110' },
  //   {province: '山东', name: '烟台', percent: '100', num: '120' },
  //   {province: '山东', name: '临沂', percent: '40', num: '40' },
  //   {province: '四川', name: '广元', percent: '90', num: '110' },
  //   {province: '江苏', name: '南京', percent: '70', num: '90' },
  //   {province: '河南', name: '郑州', percent: '90', num: '110' },
  //   {province: '江苏', name: '徐州', percent: '70', num: '90' },
  //   // {province: '', name: '', percent: '', num: '' },
  //   // {province: '', name: '', percent: '', num: '' },
  // ];



  name: "echarts",
  props: ["userJson"],
  data() {
    return {
      chart: null
    };
  },
  mounted() {
    this.chinaConfigure();
  },
  beforeDestroy() {
    if (!this.chart) {
      return;
    }
    this.chart.dispose();
    this.chart = null;
  },
  methods: {
    chinaConfigure() {
      console.log(this.userJson)
      let myChart = echarts.init(this.$refs.myEchart); //这里是为了获得容器所在位置
      window.onresize = myChart.resize;
      myChart.setOption({ // 进行相关配置
        // backgroundColor: "#02AFDB",
        tooltip: {
          trigger: 'item',
          formatter: '{b}：{c}'
        },
        visualMap: {
          min: 0,
          max: 500,
          realtime: false,
          inRange: {
            color: ['#44608b', '#e66b00']
          }
        },
        series: [
          {
            type: 'map',
            mapType: 'china',  //  与注册时的名字保持统一   echarts.registerMap('China', geoJson);
            itemStyle: {
              normal: {
                areaColor: '#44608b',
                borderColor: 'white',
                label: { show: true, color: 'white' }
              },
              emphasis: {
                areaColor: '#A5DABB'
              }
            },
            zoom: 1.2,
            data: [
              { name: '北京', value: 40 },
              { name: '天津', value: 0 },
              { name: '重庆', value: 0 },
              { name: '上海', value: 70 },
              { name: '湖南', value: 0 },
              { name: '广东', value: 0 },
              { name: '福建', value: 0 },
              { name: '江西', value: 0 },
              { name: '四川', value: 100 },
              { name: '广西', value: 0 },
              { name: '新疆', value: 0 },
              { name: '西藏', value: 0 },
              { name: '青海', value: 0 },
              { name: '甘肃', value: 60 },
              { name: '宁夏', value: 0 },
              { name: '内蒙古', value: 0 },
              { name: '海南', value: 0 },
              { name: '山西', value: 0 },
              { name: '陕西', value: 0 },
              { name: '云南', value: 0 },
              { name: '贵州', value: 0 },
              { name: '湖北', value: 0 },
              { name: '浙江', value: 0 },
              { name: '安徽', value: 0 },
              { name: '河南', value: 0 },
              { name: '山东', value: 300 },
              { name: '江苏', value: 60 },
              { name: '河北', value: 0 },
              { name: '辽宁', value: 0 },
              { name: '吉林', value: 0 },
              { name: '黑龙江', value: 0 },
              { name: '南海诸岛', value: 0 },
              { name: '台湾', value: 0 }]
          }
        ]

      });
      const echart = echarts.init(document.getElementById('map')); // 获取视图的echarts的DOM节点，并初始化对象
      echart.on('click', function(obj) { // 绑定地图点击事件
        alert("111")
        if (obj.data) {

          if (obj.data.name === '山东') {
            this.regionOptions = {
              tooltip: {
                trigger: 'item',
                formatter: '{b}:{c}'
              },
              visualMap: {
                min: 0,
                max: 100,
                realtime: false,
                inRange: {
                  color: ['#44608b', '#44608b', '#0d98bb', '#e69805']
                }
              },
              series: [
                {
                  type: 'map',
                  mapType: obj.name,  //  与注册时的名字保持统一   echarts.registerMap('China', geoJson);
                  itemStyle: {
                    normal: {
                      areaColor: '#44608b',
                      borderColor: 'white',
                      label: { show: true, color: 'white' }
                    },
                    emphasis: {
                      areaColor: '#A5DABB'
                    }
                  },
                  zoom: 1.2,
                  data: [
                    { name: '济南市', value: 180 },
                    { name: '淄博市', value: 110 },
                    { name: '威海市', value: 90 },
                    { name: '烟台市', value: 120 },
                    { name: '青岛市', value: 110 },
                    { name: '潍坊市', value: 90 },
                    { name: '日照市', value: 80 },
                    { name: '临沂市', value: 80 },
                    { name: '枣庄市', value: 70 },
                    { name: '济宁市', value: 70 },
                    { name: '菏泽市', value: 70 },
                    { name: '聊城市', value: 60 },
                    { name: '德州市', value: 50 },
                    { name: '泰安市', value: 60 },
                    { name: '莱芜市', value: 0 },
                    { name: '东营市', value: 0 },
                    { name: '滨州市', value: 50 }]
                }
              ]
            };
            this.header = '山东省|布料机器人分布';
            this.data = this.data.filter(t => t.province === '山东');
          }

        }
      }.bind(this));
    }
  },

  // name: "index",
  // data() {
  //   return {
  //     // 版本号
  //     version: "3.4.0",
  //   };
  // },
  // methods: {
  //   goTarget(href) {
  //     window.open(href, "_blank");
  //   },
  // },
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

