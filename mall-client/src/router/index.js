import Vue from "vue";
import VueRouter from "vue-router";
import Login from "../pages/public/login.vue";
import Register from "../pages/public/register.vue";
import Index from "../pages/index/index.vue";

Vue.use(VueRouter);

const routes = [
    {
        path: "/",
        name: "login",
        component: Login,
    },
    {
        path: "/register",
        name: "register",
        component: Register,
    },
    {
        path: "/index",
        name: "index",
        component: Index,
    },
];

const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes,
});

export default router;
