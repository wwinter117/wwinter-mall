import Vue from "vue";
import VueRouter from "vue-router";
import Login from "@/pages/public/login.vue";
import Register from "@/pages/public/register.vue";
import Home from "@/pages/index/home.vue";
import Index from "@/pages/index/index.vue";
import Demo from "@/pages/404.vue";
import Dashboard from "@/pages/dashboard/dashboard.vue";

Vue.use(VueRouter);

const routes = [
    {
        path: "/",
        redirect: "/home"
    },
    {
        path: "/login",
        name: "Login",
        component: Login,
},
    {
        path: "/register",
        name: "Register",
        component: Register,
    },
    {
        path: "/index",
        name: "Index",
        component: Index,
    },
    {
        path: "/home",
        name: "Home",
        component: Home,
        redirect: "Dashboard",
        children: [
            {
                path: "/dashboard",
                name: "Dashboard",
                component: Dashboard,
            },
            {
                path: "/demo",
                name: "Demo",
                component: Demo,
            }
        ]
    },
];

const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes,
});

export default router;
