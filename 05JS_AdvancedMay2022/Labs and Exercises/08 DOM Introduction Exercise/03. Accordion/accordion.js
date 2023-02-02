function toggle() {
    let botton = document.querySelector('.button');
    let text = document.querySelector('#extra');

    if (botton.textContent === 'More') {
        botton.textContent = 'Less';
        text.style.display = 'block';
    } else {
        botton.textContent = 'More';
        text.style.display = 'none';
    }
}