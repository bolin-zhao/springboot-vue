new Vue({
    el:"#app",
    data:{
        user:{      //用于模态框数据显示
            id:"",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[]
    },

    methods:{
        //查询所有
        findAll2(){
            const _this = this;
            axios.get('findAll')
                .then(function (response) {
                    console.log("response==",response);

                    _this.userList =response.data
                }).catch(function (error) {
                console.log(error)
            })
        },
        update(){
            const _this = this;
            //此处原生 需要('upd json 参数， 怎么才能是json格式呢 ，可以在controller中 使用@RequestBody注解
            axios.post('update', _this.user)
                .then(function (response) {
                    console.log(response);

                    _this.findAll2();//更新完毕刷新界面
                   $('#tab-model').modal('hide')
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        findById(userId){
            const _this = this;
            axios.get('find_by_id?id='+userId)
                .then(function (response) {
                    _this.user = response.data;//给user赋值
                    $("#myModal").show();
                    console.log(response)
                }).catch(function (error) {
                    console.log(error)
            })
        }
    },

    // vue 的生命周期，页面加载完执行查询所有
    created(){
        this.findAll2()
    }
})