function updateMenuItems(menuItem) {
    // 获取导航路径元素
    const menuItems = document.getElementById('menu-items');

    // 清空导航路径内容
    while (menuItems.firstChild) {
        menuItems.removeChild(menuItems.firstChild);
    }

    // 创建新的元素
    const newItem = document.createElement('li');
    newItem.className = 'menu-span';
    newItem.textContent = ' > ' + menuItem;

    // 添加新元素到导航路径
    menuItems.appendChild(newItem);
}
