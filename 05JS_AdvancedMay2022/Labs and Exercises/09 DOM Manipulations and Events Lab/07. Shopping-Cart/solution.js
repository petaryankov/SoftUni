function solve() {
   document.getElementsByClassName('shopping-cart')[0]
      .addEventListener('click', onClick);
   document.getElementsByClassName('checkout')[0]
      .addEventListener('click', checkout);

   const products = [];
   const texAreaElement = document.getElementsByTagName('textarea')[0];
   let totalPrice = 0;
   let allProducts = [];
   function onClick(ev) {
      if (ev.target.tagName == 'BUTTON' && ev.target.classList.contains('add-product')) {
         const product = ev.target.parentNode.parentNode;
         let productName = product.querySelector('.product-title').textContent;
         let productPrice = Number(product.querySelector('.product-line-price').textContent);

         products.push({
            productName,
            productPrice
         });

         texAreaElement.value += `Added ${productName} for ${productPrice.toFixed(2)} to the cart.\n`;
         if (!allProducts.includes(productName)) {
            allProducts.push(productName);
         }
         totalPrice += productPrice;
      }
   }
   function checkout() {
      let list = allProducts.join(', ');
      texAreaElement.value = `You bought ${list} for ${totalPrice.toFixed(2)}.`;
      disableBuutnos();

   }
   function disableBuutnos() {
      Array.from(document.querySelectorAll('button'))
      .forEach(b => b.disabled = true);
   }

}