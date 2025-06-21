import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussdangjianxinxi from '@/views/modules/discussdangjianxinxi/list'
    import dangjianxinxi from '@/views/modules/dangjianxinxi/list'
    import shenqingzhuanchu from '@/views/modules/shenqingzhuanchu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import xuexixinde from '@/views/modules/xuexixinde/list'
    import shenqingzhuanru from '@/views/modules/shenqingzhuanru/list'
    import rudangshenqing from '@/views/modules/rudangshenqing/list'
    import config from '@/views/modules/config/list'
    import dangzhibu from '@/views/modules/dangzhibu/list'
    import jiaonadangfei from '@/views/modules/jiaonadangfei/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/discussdangjianxinxi',
        name: '党建信息评论',
        component: discussdangjianxinxi
      }
      ,{
	path: '/dangjianxinxi',
        name: '党建信息',
        component: dangjianxinxi
      }
      ,{
	path: '/shenqingzhuanchu',
        name: '申请转出',
        component: shenqingzhuanchu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/xuexixinde',
        name: '学习心得',
        component: xuexixinde
      }
      ,{
	path: '/shenqingzhuanru',
        name: '申请转入',
        component: shenqingzhuanru
      }
      ,{
	path: '/rudangshenqing',
        name: '入党申请',
        component: rudangshenqing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/dangzhibu',
        name: '党支部',
        component: dangzhibu
      }
      ,{
	path: '/jiaonadangfei',
        name: '缴纳党费',
        component: jiaonadangfei
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
