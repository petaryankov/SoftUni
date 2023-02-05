function addItem() {
    let newItemTextEl = document.getElementById('newItemText');
    let newItemValueEl = document.getElementById('newItemValue');
    let menuEl = document.getElementById('menu');

    let newElOption = document.createElement('option');
    newElOption.textContent = newItemTextEl.value;
    newElOption.value = newItemValueEl.value;
    newItemTextEl.value = '';
    newItemValueEl.value = '';
    menuEl.appendChild(newElOption);
}