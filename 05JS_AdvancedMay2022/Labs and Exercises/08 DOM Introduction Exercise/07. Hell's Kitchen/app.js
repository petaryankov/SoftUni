function solve() {
   document.querySelector('#btnSend').addEventListener('click', onClick);

   function onClick() {
      let arrInput = JSON.parse(document.querySelector('#inputs textarea').value);
      let restaurants = {};
      
      for (const line of arrInput) {
         let workersInfo = line.split(' - ');
         let restaurantName = workersInfo.shift();
         let workersData = workersInfo[0].split(', ');
         for (const workerInfo of workersData) {
            let [workerName, salary] = workerInfo.split(' ');

            if (!restaurants.hasOwnProperty(restaurantName)) {
               restaurants[restaurantName] = {};
            }
            restaurants[restaurantName][workerName] = Number(salary);
         }  
      }
      let averageSalary = 0;
      let bestAverageSalary = 0;
      let bestRestaurant = '';
      let restorantEntries = Object.entries(restaurants);
      for (const restorant of restorantEntries) {
         let totalSalary = 0;

         let key = restorant[0];
         let values = Object.values(restorant[1]);
         
         for (const salary of values) {
            totalSalary += salary;
         }
         averageSalary = totalSalary / values.length;
         if (averageSalary > bestAverageSalary) {
            bestAverageSalary = averageSalary.toFixed(2);
            bestRestaurant = key;
         }
      }
      let result = Object.entries(restaurants[bestRestaurant]).sort((a,b) => b[1] - a[1]);
      let firstText = `Name: ${bestRestaurant} Average Salary: ${bestAverageSalary} Best Salary: ${result[0][1].toFixed(2)}`;
      let secondText = '';
      result.forEach(w => secondText+= `Name: ${w[0]} With Salary: ${w[1]} `);
      document.querySelector('#bestRestaurant p').textContent = firstText;
      document.querySelector('#workers p').textContent = secondText;
   }
}