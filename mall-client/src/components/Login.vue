<template>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>注册登录</title>
  </head>
  <body>

  <div id="container">

    <form id="loginForm">
      <h2>Login</h2>
      <!-- 在输入框标签中添加 onkeydown 事件 -->
      <label for="loginUsername">Username:</label>
      <input type="text" id="loginUsername" name="loginUsername" required onkeydown="handleKeyPress(event, login)">

      <label for="loginPassword">Password:</label>
      <input type="password" id="loginPassword" name="loginPassword" required onkeydown="handleKeyPress(event, login)">

      <button type="button" @click="login()">Login</button>

      <div class="switch">
        <p>Don't have an account? <a href="#" @click="showRegisterForm()">Register</a></p>
      </div>
    </form>

    <form id="registerForm" style="display: none;">
      <h2>Register</h2>
      <label for="registerUsername">Username:</label>
      <input type="text" id="registerUsername" name="registerUsername" required>

      <label for="registerPassword">Password:</label>
      <input type="password" id="registerPassword" name="registerPassword" required>

      <label for="confirmPassword">Confirm Password:</label>
      <input type="password" id="confirmPassword" name="confirmPassword" required>

      <button type="button" @click="register()">Register</button>

      <div class="switch">
        <p>Already have an account? <a href="#" @click="showLoginForm()">Login</a></p>
      </div>
    </form>

  </div>
  </body>
</template>


<script>

export default {
  name: 'Index-Js',
  methods: {
    async login() {  // 添加 async 关键字
      const username = document.getElementById('loginUsername').value;
      const password = document.getElementById('loginPassword').value;

      const body = {
        username: username,
        password: password
      };

      try {
        const response = await fetch('admin/login', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(body)
        });

        const data = await response.json();

        if (data.code === 200) {
          alert('登录成功!');
          // 页面跳转到首页
          // 1秒后跳转到首页
          setTimeout(() => {
            window.location.href = '../html/index.html';
          }, 1000);
        } else {
          alert(`登录失败: ${data.message}`);
        }
      } catch (error) {
        console.error('Error during login:', error);
        alert('An error occurred during login. Please try again.');
      }
    },

    showRegisterForm() {
      document.getElementById('loginForm').style.display = 'none';
      document.getElementById('registerForm').style.display = 'block';
    },

    showLoginForm() {
      document.getElementById('loginForm').style.display = 'block';
      document.getElementById('registerForm').style.display = 'none';
    },

    // 添加 handleKeyPress 函数
    handleKeyPress(event, callback) {
      if (event.key === 'Enter') {
        callback();
      }
    },
    
    async register() {
      const username = document.getElementById('registerUsername').value;
      const password = document.getElementById('registerPassword').value;
      const confirmPassword = document.getElementById('confirmPassword').value;

      // Validate password and confirmPassword
      if (password !== confirmPassword) {
        alert('密码不匹配, 请重新输入');
        return;
      }

      const body = {
        username: username,
        password: password
      };

      try {
        const response = await fetch('admin/register', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(body),
        });
        const data = await response.json();
        if (200 === data.code) {
          alert(`注册成功`);
          // Automatically switch to the login form after successful registration
          this.showLoginForm();
        } else {
          alert(`注册失败: ${data.message}`);
        }
      } catch (error) {
        console.error('Error during registration:', error);
        alert('An error occurred during registration. Please try again.');
      }
    }
  }
}
</script>
