<template>
  <div class="home">

    <div class="home-left">
      <div class="home-logo">
        <img class="logo" src="../../static/jay.jpeg" alt="Logo">
      </div>

      <div class="home-manu">

      </div>

      <div class="home-user">

      </div>
    </div>

    <div class="home-right">
      <router-view></router-view>
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
    fn() {
      this.$router.push('Demo');
    }

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.home-logo {
  display: flex;
  justify-content: center;
  align-items: center;

}

.home-logo img {
  width: 40px;
  height: 40px;
  //margin-right: 5px;
  border-radius: 50%; /* 将头像变成圆形 */
  transition: all 0.3s ease;
}

.home {
  display: flex;
  justify-content: flex-start;
  height: 100vh;
}

.home-left {
  width: 200px;
  background-color: transparent;
//background-image: url("@/static/jay.jpeg"); border-right: 2px solid #efefef;
}

.home-right {
  flex: 1;
}

.home-logo {
  height: 100px;
  //background-color: peru;
}

.home-manu {
  height: 400px;
  //background-color: black;
}

.home-user {
  height: 200px;
  //background-color: green;
}


</style>
