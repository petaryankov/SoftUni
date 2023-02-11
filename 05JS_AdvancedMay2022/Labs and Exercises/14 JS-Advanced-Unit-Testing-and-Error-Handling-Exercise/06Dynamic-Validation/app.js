function validate() {
    let inputTextEl = document.getElementById('email');
    let emailRegex = new RegExp('^[a-z]+@[a-z]+\\.[a-z]+');

    inputTextEl.addEventListener('change', () => {
        if (emailRegex.test(inputTextEl.value)) {
            inputTextEl.classList.remove('error');
        } else {
            inputTextEl.classList.add('error');
        }
    });
}