function extractText() {
    let ulElement = document.getElementById('items');

    let textAreaElements = document.getElementById('result');
    textAreaElements.textContent = ulElement.textContent;
}