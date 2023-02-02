function search() {
   let towns = Array.from(document.querySelectorAll('#towns li'));
   let userSearch = document.getElementById('searchText').value;
   let count = 0;
   
   for (const town of towns) {
      if (town.textContent.includes(userSearch)) {
         town.style.fontWeight = 'bold';
         town.style.textDecoration = 'underline';
         count++; 
      } else {
         town.style.fontWeight = 'normal';
         town.style.textDecoration = 'none';
      }
   }
   let result = `${count} matches found`;
   document.getElementById('result').textContent = result;
}
