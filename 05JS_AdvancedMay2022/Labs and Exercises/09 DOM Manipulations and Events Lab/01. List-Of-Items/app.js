function addItem() {
    inputElementa = document.getElementById('newItemText');
    itemsElement = document.getElementById('items');
    let liElement = document.createElement('li');
    liElement.textContent = inputElementa.value;
    itemsElement.appendChild(liElement);
}