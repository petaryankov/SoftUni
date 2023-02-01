function colorize() {
    let toColorElements = document.querySelectorAll('tr:nth-of-type(even)');

    for (let i = 0; i < toColorElements.length; i++) {
        toColorElements[i].style.backgroundColor = 'teal';
    }

}