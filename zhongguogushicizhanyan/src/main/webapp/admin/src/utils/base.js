const base = {
    get() {
        return {
            url : "http://localhost:8080/zhongguogushicizhanyan/",
            name: "zhongguogushicizhanyan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhongguogushicizhanyan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新媒体视域下的中国古诗词展演"
        } 
    }
}
export default base
