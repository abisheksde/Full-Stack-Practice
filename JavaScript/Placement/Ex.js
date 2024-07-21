document.addEventListener('DOMContentLoaded', function() {
    const listItems = document.querySelectorAll('#myList li');

    listItems.forEach(item => {
        item.addEventListener('click', function() {
            // Remove the 'active' class from all list items
            listItems.forEach(li => li.classList.remove('active'));
            
            // Add the 'active' class to the clicked list item
            this.classList.add('active');
        });
    });
});
