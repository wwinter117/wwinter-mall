<template>
  <div class="dashboard">
    <div class="dashboard-left">
      <div class="dashboard-grep">

      </div>

      <div class="dashboard-info">

      </div>

      <div class="dashboard-chart">

      </div>

      <div class="dashboard-task">

      </div>
    </div>

    <div class="dashboard-right">
      <div class="user-info">

      </div>

      <div class="user-chart">

      </div>
    </div>
  </div>
</template>

<script setup>
</script>

<style>
.dashboard {
  display: flex;
  width: 100%;
  justify-content: flex-start;
}

.dashboard-left {
  flex: 1;
}

.dashboard-right {
  width: 200px;
}


.dashboard-grep {
  height: 100px;
  background: #2c3e50;
}

.dashboard-info {
  height: 100px;
  background: black;
}

.dashboard-chart {
  height: 100px;
  background: #42b983;
}

.dashboard-task {
  height: 100px;
  background: #494949;
}


.user-info {
  height: 100px;
  background: #d94949;
}

.user-chart {
  height: 100px;
  background: #484848;
}
</style>