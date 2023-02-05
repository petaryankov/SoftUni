function solve() {
  //[{"name": "Sofa", "img": "https://res.cloudinary.com/maisonsdumonde/image/upload/q_auto,f_auto/w_200/img/grey-3-seater-sofa-bed-200-13-0-175521_9.jpg", "price": 150, "decFactor": 1.2}]
  let [generateBut, buyBut] = Array.from(document.querySelectorAll('button'));
  generateBut.addEventListener('click', generate);
  buyBut.addEventListener('click', buy);

  function generate() {
    let input = JSON.parse(document.querySelector('textarea').value);
    input.forEach(el => {
      let tr = document.createElement('tr');
      let td1 = document.createElement('td');
      let img = document.createElement('img');
      img.src = el.img;
      td1.appendChild(img);
      tr.appendChild(td1);

      let td2 = document.createElement('td');
      let p1 = document.createElement('p');
      p1.textContent = el.name;
      td2.appendChild(p1);
      tr.appendChild(td2);

      let td3 = document.createElement('td');
      let p2 = document.createElement('p');
      p2.textContent = Number(el.price);
      td3.appendChild(p2);
      tr.appendChild(td3);

      let td4 = document.createElement('td');
      let p3 = document.createElement('p');
      p3.textContent = Number(el.decFactor);
      td4.appendChild(p3);
      tr.appendChild(td4);

      let td5 = document.createElement('td');
      let inputEl = document.createElement('input');
      inputEl.type = 'checkbox';
      td5.appendChild(inputEl);
      tr.appendChild(td5);
      document.querySelector('tbody').appendChild(tr);
    });
  }
  function buy() {
    let checkboxes = Array.from(document.querySelectorAll('tbody input'))
      .filter(e => e.checked);
    let items = [];
    let totalPrice = 0;
    let averageDecFact = 0;
    for (const box of checkboxes) {
      let parent = box.parentElement.parentElement;
      let data = parent.querySelectorAll('p');
      let [name, price, decFactor] = data;
      items.push(name.textContent);
      totalPrice += Number(price.textContent);
      averageDecFact += Number(decFactor.textContent);
    }
    averageDecFact = averageDecFact / checkboxes.length;
    let output = document.querySelectorAll('textarea')[1];
    output.textContent += `Bought furniture: ${items.join(', ')}\n`;
    output.textContent += `Total price: ${totalPrice.toFixed(2)}\n`;
    output.textContent += `Average decoration factor: ${averageDecFact}`;
  }
}