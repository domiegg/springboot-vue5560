
var projectName = '智慧党建系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '党支部',
	url: './pages/dangzhibu/list.html'
}, 
{
	name: '党建信息',
	url: './pages/dangjianxinxi/list.html'
}, 
{
	name: '学习心得',
	url: './pages/xuexixinde/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot0w65d/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"党支部","menuJump":"列表","tableName":"dangzhibu"}],"menu":"党支部管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除","审核"],"menu":"入党申请","menuJump":"列表","tableName":"rudangshenqing"}],"menu":"入党申请管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改","删除"],"menu":"缴纳党费","menuJump":"列表","tableName":"jiaonadangfei"}],"menu":"缴纳党费管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除","审核","查看评论"],"menu":"党建信息","menuJump":"列表","tableName":"dangjianxinxi"}],"menu":"党建信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","审核"],"menu":"学习心得","menuJump":"列表","tableName":"xuexixinde"}],"menu":"学习心得管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除"],"menu":"申请转入","menuJump":"列表","tableName":"shenqingzhuanru"}],"menu":"申请转入管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"申请转出","menuJump":"列表","tableName":"shenqingzhuanchu"}],"menu":"申请转出管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","申请转入","申请转出"],"menu":"党支部列表","menuJump":"列表","tableName":"dangzhibu"}],"menu":"党支部模块"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"党建信息列表","menuJump":"列表","tableName":"dangjianxinxi"}],"menu":"党建信息模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"学习心得列表","menuJump":"列表","tableName":"xuexixinde"}],"menu":"学习心得模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除"],"menu":"入党申请","menuJump":"列表","tableName":"rudangshenqing"}],"menu":"入党申请管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","支付"],"menu":"缴纳党费","menuJump":"列表","tableName":"jiaonadangfei"}],"menu":"缴纳党费管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"学习心得","menuJump":"列表","tableName":"xuexixinde"}],"menu":"学习心得管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除"],"menu":"申请转入","menuJump":"列表","tableName":"shenqingzhuanru"}],"menu":"申请转入管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"申请转出","menuJump":"列表","tableName":"shenqingzhuanchu"}],"menu":"申请转出管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","申请转入","申请转出"],"menu":"党支部列表","menuJump":"列表","tableName":"dangzhibu"}],"menu":"党支部模块"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"党建信息列表","menuJump":"列表","tableName":"dangjianxinxi"}],"menu":"党建信息模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"学习心得列表","menuJump":"列表","tableName":"xuexixinde"}],"menu":"学习心得模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["缴纳党费","查看"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"入党申请","menuJump":"列表","tableName":"rudangshenqing"}],"menu":"入党申请管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"缴纳党费","menuJump":"列表","tableName":"jiaonadangfei"}],"menu":"缴纳党费管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","查看评论"],"menu":"党建信息","menuJump":"列表","tableName":"dangjianxinxi"}],"menu":"党建信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"学习心得","menuJump":"列表","tableName":"xuexixinde"}],"menu":"学习心得管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","审核"],"menu":"申请转入","menuJump":"列表","tableName":"shenqingzhuanru"}],"menu":"申请转入管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","审核"],"menu":"申请转出","menuJump":"列表","tableName":"shenqingzhuanchu"}],"menu":"申请转出管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","申请转入","申请转出"],"menu":"党支部列表","menuJump":"列表","tableName":"dangzhibu"}],"menu":"党支部模块"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"党建信息列表","menuJump":"列表","tableName":"dangjianxinxi"}],"menu":"党建信息模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"学习心得列表","menuJump":"列表","tableName":"xuexixinde"}],"menu":"学习心得模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"党支部","tableName":"dangzhibu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
