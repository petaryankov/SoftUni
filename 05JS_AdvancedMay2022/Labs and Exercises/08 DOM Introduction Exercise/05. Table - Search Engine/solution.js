function solve() {
   document.querySelector('#searchBtn').addEventListener('click', onClick);
   let rows = document.querySelectorAll('tbody tr');
   let input = document.getElementById('searchField');

   function onClick() {
      for (const row of rows) {
         row.classList.remove('select');
         if (input.value !== '' && row.innerHTML.includes(input.value)) {
            row.className = 'select';
         }
      }
   }
}