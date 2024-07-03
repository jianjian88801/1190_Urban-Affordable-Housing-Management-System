const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooth6iu7/",
            name: "springbooth6iu7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooth6iu7/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "城镇保障性住房管理系统"
        } 
    }
}
export default base
