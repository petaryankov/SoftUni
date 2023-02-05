function create(words) {
   let contentElement = document.getElementById('content');

   for (const word of words) {

      let div = document.createElement('div');
      let p = document.createElement('p');

      p.appendChild(document.createTextNode(word));
      p.style.display = 'none';
      div.appendChild(p);

      div.addEventListener('click', add);
      function add(ev) {
         ev.target.children[0].style.display = 'block';
      }
      contentElement.appendChild(div);
   }
}