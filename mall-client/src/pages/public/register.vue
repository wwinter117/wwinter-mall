<template>
  <div class="login-register" id="register-container">
    <h2>Register</h2>
    <label for="registerUsername">Username:</label>
    <input type="text" v-model="registerParam.username" required>

    <label for="registerPassword">Password:</label>
    <input type="password" v-model="registerParam.password" required>

    <label for="confirmPassword">Confirm Password:</label>
    <input type="password" v-model="registerParam.confirmPassword" required>

    <button type="button" @click="register()">Register</button>

    <div class="switch">
      <p>Already have an account? <span @click="showLoginForm()">Login</span></p>
    </div>
  </div>
</template>

<script>
import {HttpMange} from "@/api";

export default {
  name: "Register-Js",
  data: () => {
    return {
      registerParam: {
        username: '',
        password: '',
        confirmPassword: '',
        roles: [
          "ROLE_USER", "ROLE_TEST"
        ]
      },
    };
  },
  methods: {
    async register() {
      if (this.registerParam.password !== this.registerParam.confirmPassword) {
        alert('密码不匹配, 请重新输入');
        return;
      }
      HttpMange.register(this.registerParam).then(response => {
        if (response.code === 200) {
          alert('注册成功');
        } else {
          alert(`注册失败: ${response.message}`);
        }
      }).catch(err => {
        alert(`异常: ${err}`);
      });
    },

    showLoginForm() {
      this.$router.push("Login");
    },
  }
}
</script>