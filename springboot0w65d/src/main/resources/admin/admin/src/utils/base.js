const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0w65d/",
            name: "springboot0w65d",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0w65d/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧党建系统"
        } 
    }
}
export default base
