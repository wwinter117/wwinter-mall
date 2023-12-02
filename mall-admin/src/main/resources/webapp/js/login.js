function showRegisterForm() {
    document.getElementById('loginForm').style.display = 'none';
    document.getElementById('registerForm').style.display = 'block';
}

function showLoginForm() {
    document.getElementById('loginForm').style.display = 'block';
    document.getElementById('registerForm').style.display = 'none';
}

// 添加 handleKeyPress 函数
function handleKeyPress(event, callback) {
    if (event.key === 'Enter') {
        callback();
    }
}


// script.js
async function login() {
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

        if (response.ok) {
            alert('Login successful!');
            // 页面跳转到首页
            window.location.href = '../html/index.html';
        } else {
            alert(`Login failed: ${data.message}`);
        }
    } catch (error) {
        console.error('Error during login:', error);
        alert('An error occurred during login. Please try again.');
    }
}

async function register() {
    const username = document.getElementById('registerUsername').value;
    const password = document.getElementById('registerPassword').value;
    const confirmPassword = document.getElementById('confirmPassword').value;

    // Validate password and confirmPassword
    if (password !== confirmPassword) {
        alert('Passwords do not match');
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
            body: JSON.stringify(body)
        });

        const data = await response.json();

        if (response.ok) {
            alert('Registration successful!');
            // Automatically switch to the login form after successful registration
            showLoginForm();
        } else {
            alert(`Registration failed: ${data.message}`);
        }
    } catch (error) {
        console.error('Error during registration:', error);
        alert('An error occurred during registration. Please try again.');
    }
}


function loadBrands() {
    // 使用Ajax请求后端API获取品牌数据并展示在页面上
    // 例如，可以使用Fetch API或jQuery的ajax方法
    // 将品牌数据追加到id为brandList的ul元素中
    const brandList = document.getElementById('brandList');
    brandList.innerHTML = '<li>Brand 1</li><li>Brand 2</li><li>Brand 3</li>';
}

function loadCategories() {
    // 类似地，使用Ajax请求后端API获取商品分类数据并展示在页面上
    const categoryList = document.getElementById('categoryList');
    categoryList.innerHTML = '<li>Category 1</li><li>Category 2</li><li>Category 3</li>';
}

function loadUsers() {
    // 同样，使用Ajax请求后端API获取用户数据并展示在页面上
    const userList = document.getElementById('userList');
    userList.innerHTML = '<li>User 1</li><li>User 2</li><li>User 3</li>';
}

