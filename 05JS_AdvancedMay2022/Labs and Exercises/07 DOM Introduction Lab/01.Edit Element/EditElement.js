function editElement(htmlRef, stringMatch, replacer) {

    // while (htmlRef.textContent.includes(stringMatch)) {
    //     htmlRef.textContent = htmlRef.textContent.replace(match, replacer); 
    // }
    //regex salution
    let pattern = new RegExp(stringMatch, 'g');
    htmlRef.textContent = htmlRef.textContent.replace(pattern ,replacer);
}