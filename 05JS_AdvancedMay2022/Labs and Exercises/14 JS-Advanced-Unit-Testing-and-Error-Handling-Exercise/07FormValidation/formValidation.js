function validate() {
    let checkBoxEl = document.getElementById('company');
    //if company 
    checkBoxEl.addEventListener('change', () => {
        let companyInfo = document.getElementById('companyInfo');

        if (!checkBoxEl.checked) {
            companyInfo.style.display = 'none';
        } else {
            companyInfo.style.display = 'block';
        }
    });
    document.getElementById('submit').addEventListener('click', onClick);

    function onClick(e) {
        e.preventDefault();
        
        let invalidFields = [];
        let confirmaPasswordEl = document.getElementById('confirm-password');
        let companyID = document.getElementById('companyNumber');
        let companyPattern = /^[0-9]{4}$/;
        let usernameEl = document.getElementById('username');
        let usernamePattern = /^[A-Za-z0-9]{3,20}$/;
        
        if (!usernamePattern.test(usernameEl.value)) {
            invalidFields.push(usernameEl);
        }
        let emailEl = document.getElementById('email');
        let emailPattern = /^[^@.]+@[^@]*\.[^@]*$/;
        
        if (!emailPattern.test(emailEl.value)) {
            invalidFields.push(emailEl);
        }
        let passwordEl = document.getElementById('password');
        let passwordPattern = /^[\w]{5,15}$/;

        if (!passwordPattern.test(passwordEl.value) || passwordEl.value !== confirmaPasswordEl.value) {
            invalidFields.push(passwordEl);
            invalidFields.push(confirmaPasswordEl);
        }
        if (checkBoxEl.checked) {
            if (!companyPattern.test(companyID.value)) {
                invalidFields.push(companyID);
            }
        }
        let validDivEl = document.querySelector('#valid');
        invalidFields.forEach(e => e.style.borderColor = 'red');
        !invalidFields.length ? validDivEl.style.display = 'block'
            : validDivEl.style.display = 'none';
    }
}