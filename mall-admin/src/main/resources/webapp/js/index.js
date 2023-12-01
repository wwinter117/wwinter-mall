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

