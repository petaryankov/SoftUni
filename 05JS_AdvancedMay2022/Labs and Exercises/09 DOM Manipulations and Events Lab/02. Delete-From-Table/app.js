function deleteByEmail() {
    let inputToMatch = document.querySelector('input[name = email]');
    let emailElements = document.querySelectorAll('tr td:nth-of-type(2)');
    
    let targetEmail = Array.from(emailElements)
    .find(e => e.textContent === inputToMatch.value);
    let result = document.getElementById('result');
    if (targetEmail) {
        targetEmail.parentNode.remove();
        result.textContent = 'Deleted.';
    } else {
        result.textContent = 'Not found.';
    }
}