function attachGradientEvents() {
    let gradientElement = document.getElementById('gradient');
    gradientElement.addEventListener('mousemove', gradientMouseoverHendler);
    let resultElement = document.getElementById('result');

    function gradientMouseoverHendler (e) {
        resultElement.textContent = Math.floor((e.offsetX / gradientElement.clientWidth) * 100) + '%';
    };
}