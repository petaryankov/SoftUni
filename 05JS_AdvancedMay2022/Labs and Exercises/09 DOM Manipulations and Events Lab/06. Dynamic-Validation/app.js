function validate() {
    let pattern = /\S+@\S+\.\S+/;
    let inputElement = document.querySelector('#email');
    
    inputElement.addEventListener('change', (e) => {
        if (e.target.value.search(pattern) === -1) {
            e.target.classList.add('error');
        } else {
            e.target.classList.remove('error');
        }
    });
}