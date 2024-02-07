document.addEventListener('DOMContentLoaded', function() {
    var accordionButton = document.getElementById('toggleButton');
    var userList = document.getElementById('userList');

    accordionButton.addEventListener('click', function() {
        this.classList.toggle('active');
        if (userList.style.maxHeight) {
            userList.style.maxHeight = null;
        } else {
            userList.style.maxHeight = userList.scrollHeight + 'px';
        }
    });
});
