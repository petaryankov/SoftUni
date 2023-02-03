function solve() {
  let inputText = document.getElementById('input');
  let filteredText = inputText.value.split('.').filter(e => e !== '');
  let output = document.getElementById('output');

  while (filteredText.length > 0) {
    let textLine = filteredText.splice(0, 3).join('. ') + '.';
    let p = document.createElement('p');
    p.textContent = textLine;
    output.appendChild(p);
  }
}