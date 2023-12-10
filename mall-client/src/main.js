import { createApp } from 'vue'
import App from './components/Index.vue'
import { createRouter, createWebHistory } from 'vue-router';
import Login from './components/Login.vue';

const routes = [
    // 其他路由...
    {
        path: '/login',
        name: 'Login',
        component: Login
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});
const app = createApp(App);
app.use(router).mount('#app')
