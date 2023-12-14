<template>
  <div class="login-register" id="login-container">
    <h2>Login</h2>
    <!-- 在输入框标签中添加 onkeydown 事件 -->
    <label for="loginUsername">Username:</label>
    <input type="text" v-model="loginParams.username" required>

    <label for="loginPassword">Password:</label>
    <input type="password" v-model="loginParams.password" required>

    <button type="button" @click="login()">Login</button>

    <div class="switch">
      <p>Don't have an account? <a href="#" @click="showRegisterForm()">Register</a></p>
    </div>
  </div>
</template>

<script>
import {HttpMange} from "@/api";

export default {
  name: 'Index-Js',
  data: () => {
    return {
      loginParams: {
        username: '',
        password: '',
      }
    }
  },
  methods: {
    async login() {  // 添加 async 关键字
      console.log(this.loginParams);
      HttpMange.login(this.loginParams).then((response) => {
        if (response.code === 200) {
          alert('登录成功!');
          // 页面跳转到首页
          this.$router.push("index");
          this.$store.commit('setToken', response.data);
        } else {
          alert(`登录失败: ${response.message}`);
        }
      }).catch((err) => {
        alert(`异常: ${err}`);
      })
    },

    showRegisterForm() {
      this.$router.push("register");
    },

    // 添加 handleKeyPress 函数
    handleKeyPress(event, callback) {
      if (event.key === 'Enter') {
        callback();
      }
    },
  }
}
</script>
