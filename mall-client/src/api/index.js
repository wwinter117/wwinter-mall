import {getBaseURL, get, post, deletes} from "./request";

const HttpMange = {
    attachImageUrl: (url) => url ? `${getBaseURL()}/${url}` : "https://cube.elemecdn.com/e/fd/0fc7d20532fdaf769a25683617711png.png",

    // 登录
    login: ({username, password}) => post(`/admin/login`, {
        username,
        password
    }),

    // 注册
    register: ({username, password, icon, email, roles}) => post(`/admin/register`, {
        username,
        password,
        icon,
        email,
        roles
    }),

    // brand
    getBrandList: () => get(`brand/list`),
    getBrandListAll: () => get(`brand/listAll`),

};

export {HttpMange};