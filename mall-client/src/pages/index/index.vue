<template>
  <div>
    <!-- 页头 -->
    <header id="pageHeader">
      <div class="logo">
        <img src="../../static/jay.jpeg" alt="Logo">
        <span class="brandName">Jay-Web</span>
      </div>

      <div class="searchBox">
        <label>
          <input type="text" placeholder="查找(⌘+K)"/>
        </label>
      </div>

      <div class="userSection">
        <div class="notice">
          <img src="../../static/notice_通知.svg" alt="notice">
          <span class="notice-info">1</span>
        </div>
        <div class="userProfile" @click="goToLogin()">
          <img src="../../static/user2.svg" alt="User Avatar">
          <span class="username">Wwinter117</span>
        </div>
        <div class="logoutProfile">
          <img src="../../static/注销-white.svg" alt="User Avatar">
          <a href="/login" class="userLogout">注销</a>
        </div>
      </div>
    </header>

    <!--  Dashboard  -->
    <div class="dashboard_div_0" id="breadcrumb">
      <div class="dashboard_div">
        <ol class="list-item-class" id="list-item">
          <li class="dashboard-item">
            <a href="/login" class="dashboard-a" id="dashboard-a">
              Dashboard
            </a>
            <img src="../../static/edit.svg" alt="edit">
          </li>
        </ol>
        <ol class="menu-item-class" id="menu-items">
        </ol>
      </div>
    </div>

    <div class="content_div">
      <div class="side-panel">
        <div id="tasks">
          <div class="task" @click="updateMenuItems('商品')">
                <span class="task-link-wrapper">
                        <a class="task-link">
                            <img src="../../static/product.svg" alt="product"/>
                            <span class="task-link-text">商品</span>
                        </a>
                </span>
          </div>
          <div class="task" @click="updateMenuItems('库存')">
                <span class="task-link-wrapper">
                    <a class="task-link">
                        <img src="../../static/sku.svg" alt="sku"/>
                        <span class="task-link-text">库存</span>
                    </a>
                </span>
          </div>
          <div class="task" @click="updateMenuItems('用户')">
                <span class="task-link-wrapper">
                    <a class="task-link">
                        <img src="../../static/user.svg" alt="user">
                        <span class="task-link-text">用户</span>
                    </a>
                </span>
          </div>
          <div class="task" @click="updateMenuItems('设置')">
                <span class="task-link-wrapper">
                    <a class="task-link">
                        <img src="../../static/setting.svg" alt="setting">
                        <span class="task-link-text">设置</span>
                    </a>
                </span>
          </div>
        </div>
        <div id="message">

        </div>
        <div id="setting">

        </div>
      </div>
      <div class="main-panel">
        <div class="main-panel-first-line">
          <div class="first-line-left">
            first-line-left
          </div>
          <div class="first-line-right">
            first-line-right
          </div>
        </div>

        <div class="main-panel-second-line">
          <div class="second-line-mid">
            second-line-mid
          </div>
        </div>
      </div>
    </div>
  </div>
</template>


<script>

export default {
  name: 'Index-Js',
  props: {
    msg: String
  },
  methods: {
    goToLogin() {
      this.routes.push('/login');
    },
    updateMenuItems(menuItem) {
      // 获取导航路径元素
      const menuItems = document.getElementById('menu-items');

      // 清空导航路径内容
      while (menuItems.firstChild) {
        menuItems.removeChild(menuItems.firstChild);
      }

      // 创建新的元素
      const newItem = document.createElement('li');
      newItem.className = 'menu-span';
      newItem.textContent = ' > ' + menuItem;

      // 添加新元素到导航路径
      menuItems.appendChild(newItem);
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
:root {
  --dark-background: #DCDCDC; /* 定义变量 */
}

body {
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; /* 更改字体 */
}

/* <----- pageHeader ----> */
#pageHeader {
  height: 40px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: #111; /* 深色背景 */
  padding: 8px;
  color: white;
}

.logo {
  justify-content: center;
  align-items: center;
  display: flex;
}

.logo img {
  width: 30px;
  height: 30px;
  margin-right: 5px;
  border-radius: 50%; /* 将头像变成圆形 */
  transition: all 0.3s ease;
}

.logo span {
  justify-content: center;
  align-items: center;
  font-weight: bold;
}

.searchBox {
  display: flex;
  align-items: center;
  margin-left: auto; /* 将搜索框推到右边 */
}

.searchBox img {
  width: 20px;
  height: 20px;
  margin-right: 20px;
}

/* 搜索框 */
.searchBox input {
  border: none;
  width: 350px; /* 宽度 */
  /*background-color: #fff; !* 白色背景 *!*/
  border-radius: 8px; /* 圆角 */
  padding: 12px; /* 调整内边距 */
  margin-right: 15px;
  color: #000000; /* 文字颜色 */
  font-weight: bold; /* 加粗 */
  font-size: 14px; /* 调整字体大小 */
  flex-grow: 1; /* 占据剩余空间 */
  outline: none; /* 去除输入框的默认外边框 */
  vertical-align: middle; /* 上下居中 */
  transition: all 0.4s ease;
}

.searchBox input:focus {
  /*padding: 10px;*/
  transform: scale(0.97); /* 缩放大小为原来的 1.1 倍 */
  color: #000000; /* 文字颜色 */
}


.userSection {
  display: flex;
  transition: var;
  justify-content: center;
  align-items: center;
}

/* <---------------------- UserSection ----------------------> */
.notice {
  border: none;
  padding: 4px;
  margin-right: 15px;
  border-radius: 8px;
  display: flex;
  justify-content: center;
  align-items: center;
  transition: all 0.3s ease;
}

.notice img {
  width: 22px;
  height: 22px;
  margin-right: 5px;
  transition: all 0.3s ease;
}

.notice span {
  width: 22px;
  height: 22px;
  border-radius: 4px;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #ff8800;
}

.notice:hover {
  background-color: #444; /* 稍微浅一些的深色 */
  text-decoration: underline;
}

/* <----- userProfile ----> */
.userProfile {
  border: none;
  padding: 4px;
  margin-right: 15px;
  border-radius: 8px;
  display: flex;
  justify-content: center;
  align-items: center;
  transition: all 0.3s ease;
}

.userProfile:hover {
  background-color: #444; /* 稍微浅一些的深色 */
  text-decoration: underline;
}

.userProfile img {
  width: 22px;
  height: 22px;
  margin-right: 5px;
  transition: all 0.3s ease;
}

.userProfile span {
  justify-content: center;
  align-items: center;
  font-weight: bold;
  transition: all 0.3s ease;
}

/* <----- logoutProfile ----> */
.logoutProfile {
  border: none;
  padding: 4px;
  margin-right: 15px;
  border-radius: 8px;
  display: flex;
  justify-content: center;
  align-items: center;
  transition: all 0.3s ease;
}

.logoutProfile:hover {
  background-color: #444; /* 稍微浅一些的深色 */
  text-decoration: underline;
}

.logoutProfile img {
  width: 22px;
  height: 22px;
  margin-right: 5px;
  transition: all 0.3s ease;
}

.logoutProfile a {
  text-decoration: none;
  color: #f8f8f8;
  justify-content: center;
  align-items: center;
  font-weight: bold;
  transition: all 0.3s ease;
}


/* <------ dashboard_div ------> */
.dashboard_div_0 {
  display: flex;
  align-items: center;
  background-color: rgba(244, 244, 248, .8);

}

.dashboard_div {
  height: 45px;
  display: flex;
  justify-content: left;
  align-items: center;
}

.list-item-class {
  display: flex;
  justify-content: center;
  align-items: center;
  padding-left: 10px;
}

.list-item-class li {
  font-size: 15px;
  list-style-type: none;
}

.menu-item-class {
  display: flex;
  justify-content: center;
  align-items: center;
  padding-left: 10px;
}

.menu-item-class li {
  font-size: 15px;
  list-style-type: none;
}

.dashboard-a {
  align-items: center;
  margin-right: 8px;
  justify-content: center;
  border-radius: 8px;
  display: inline-flex;
  padding: 8px 16px;
  background-color: transparent;
  color: black;
  text-decoration: none;
  transition: all 0.3s ease;
  position: relative;
}

.dashboard-a:hover {
  padding-right: 50px; /* 增加右侧 padding，使标签变长 */
  background-color: #DCDCDC;
}

.dashboard-a .dash-button-1 {
  opacity: 0;
}

.dashboard-a:hover .dash-button-1 {
  opacity: 1;
}

.menu-span {
  align-items: center;
  justify-content: center;
  border-radius: 8px;
  display: inline-flex;
  padding: 8px 16px;
  background-color: transparent;
  color: black;
  text-decoration: none;
  transition: all 0.3s ease;
  position: relative;
}

.menu-span:hover {
  background-color: #494949; /* 背景颜色变深 */
}

.dashboard-item {
  font-size: 15px;
  font-weight: 500;
  box-sizing: border-box;
  list-style-type: none;
  display: flex;
  align-items: center;
}

.dashboard-item img {
  width: 20px;
  height: 20px;
  margin-right: 20px;

}

.dashboard-item > a {
  align-items: center;
  justify-content: center;
  border-radius: 8px;
  display: inline-flex;
  padding: 8px 16px;
  background-color: transparent;
  color: black;
  text-decoration: none;
  transition: all 0.3s ease;
  position: relative;
}

.content_div {
  height: 750px;
  align-items: stretch;
  display: flex;
  flex: 1 0 auto;
  justify-content: flex-start;
}

.side-panel {
  padding: 10px;
  width: 340px;
  align-items: center;
  vertical-align: middle;
  /*flex-grow: 0.20; !* 占据页面宽度的1/4 *!*/
  flex-shrink: 0;
}

.task {
  transition: all 0.3s ease;
  font-size: 15px;
  font-weight: 400;
  border-radius: 8px;
  padding: 10px;
  margin: 10px;
  text-align: center;
}

.task:hover {
  background-color: #f1f1f1; /* 背景颜色变深 */
}

.task-icon-link {
  padding-right: 10px
}

.task-link {
  text-decoration: none;
  color: #333;
  display: flex;
  align-items: center; /* 将子元素在交叉轴上居中 */
}

.task-link img {
  width: 20px;
  height: 20px;
  margin-right: 20px;
}

/*.main-panel {*/
/*    flex: 1;*/
/*    padding: 10px;*/
/*    width: calc(100% - 370px);*/
/*    box-sizing: border-box;*/
/*    display: block;*/
/*    justify-content: center;*/
/*    align-items: center;*/
/*}*/

/*---------- main-panel ----------*/

.main-panel {
  display: flex;
  flex-direction: column;
  margin-bottom: auto;
  padding-left: 100px;
  padding-right: 100px;
  width: 800px;
  /*justify-content: center;*/
  /*align-items: center;*/
  /*background-color: #eb9316;*/
}

.main-panel-first-line, .main-panel-second-line {
  /*height: 250px;*/
  /*width: 1000px;*/
  /*box-sizing: border-box;*/
  display: flex;
  justify-content: space-between;
}

.first-line-left, .first-line-right {
  width: 200px;
  height: 200px;
  margin: 20px 100px;
  border-radius: 20px;
  background-color: #eaeaea;
  display: flex;
  justify-content: center;
  align-items: center;
  /*box-sizing: border-box;*/
  transition: all 0.3s ease;
}

/*.first-line-left:hover, .first-line-right:hover{*/
/*    transform: scale(1.1); !* 缩放大小为原来的 1.1 倍 *!*/
/*}*/
.second-line-mid {
  width: 1000px;
  height: 200px;
  margin: 20px 100px;
  border-radius: 20px;
  background-color: #eaeaea;
  display: flex;
  justify-content: center;
  align-items: center;

}
</style>
