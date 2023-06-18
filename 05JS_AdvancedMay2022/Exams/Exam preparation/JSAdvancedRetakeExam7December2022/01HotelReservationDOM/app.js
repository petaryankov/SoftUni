window.addEventListener('load', solve);

function solve() {
    let nextBtn = document.getElementById('next-btn');
    let firstNameInput = document.getElementById('first-name');
    let lasstNameInput = document.getElementById('last-name');
    let dateIn = document.getElementById('date-in');
    let dateOut = document.getElementById('date-out');
    let peopleCount = document.getElementById('people-count');

    let firstNameText = '';
    let lasstNameText = '';
    let dateInText = '';
    let dateOutText = '';
    let peopleCountNum = '';
    nextBtn.addEventListener('click', onClickNext);
    function onClickNext(e) {
        e.preventDefault();
        if (firstNameInput.value == ''
            || lasstNameInput.value == ''
            || dateIn.value == ''
            || dateOut.value == ''
            || peopleCount.value == ''
            || new Date(dateIn.value) >= new Date(dateOut.value)) {
                return
            }

            let liParent = document.getElementsByClassName('info-list')[0];
            let li = document.createElement('li');
            li.className = 'reservation-content';
            let article = document.createElement('article');
            let h3 = document.createElement('h3');
            h3.textContent = `Name: ${firstNameInput.value} ${lasstNameInput.value}`;
            article.appendChild(h3);
            let p1 = document.createElement('p');
            p1.textContent = `From date: ${dateIn.value}`;
            article.appendChild(p1);
            let p2 = document.createElement('p');
            p2.textContent = `To date: ${dateOut.value}`;
            article.appendChild(p2);
            let p3 = document.createElement('p');
            p3.textContent = `For ${peopleCount.value} people`;
            article.appendChild(p3);
            li.appendChild(article);
            let editBtn = document.createElement('button');
            editBtn.className = 'edit-btn';
            editBtn.textContent = 'Edit';
            li.appendChild(editBtn);
            let continueBtn = document.createElement('button');
            continueBtn.className = 'continue-btn';
            continueBtn.textContent = 'Continue';
            li.appendChild(continueBtn);
            liParent.appendChild(li);
            //clear first part
            nextBtn.disabled = true;
            firstNameText = firstNameInput.value;
            lasstNameText = lasstNameInput.value;
            dateInText = dateIn.value;
            dateOutText = dateOut.value;
            peopleCountNum = peopleCount.value;
            clearInputs(firstNameInput, lasstNameInput, dateIn, dateOut, peopleCount);
            editBtn.addEventListener('click', () => {
                nextBtn.disabled = false;
                firstNameInput.value = firstNameText;
                lasstNameInput.value = lasstNameText;
                dateIn.value = dateInText;
                dateOut.value = dateOutText;
                peopleCount.value = peopleCountNum;
                li.remove();
            });
            continueBtn.addEventListener('click', () => {
                let parentEl = document.getElementsByClassName('confirm-list')[0];
                parentEl.appendChild(li);
                //remove buttons
                editBtn.remove();
                continueBtn.remove();
                //add new buttons
                let confirmBtn = document.createElement('button');
                confirmBtn.className = 'confirm-btn';
                confirmBtn.textContent = 'Confirm';
                li.appendChild(confirmBtn);
                let cancelBtn = document.createElement('button');
                cancelBtn.className = 'cancel-btn';
                cancelBtn.textContent = 'Cancel';
                li.appendChild(cancelBtn);
                confirmBtn.addEventListener('click', () => {
                    li.remove();
                    nextBtn.disabled = false;
                    h1El = document.getElementById('verification');
                    h1El.className = 'reservation-confirmed';
                    h1El.textContent = 'Confirmed.';
                });
                cancelBtn.addEventListener('click', () => {
                    li.remove();
                    nextBtn.disabled = false;
                    h1El = document.getElementById('verification');
                    h1El.className = 'reservation-cancelled';
                    h1El.textContent = 'Cancelled.';
                });

            });
    }
    function clearInputs(firstName, lastName, dateIn, dateOut, peopleCount) {
        firstName.value = '';
        lastName.value = '';
        dateIn.value = '';
        dateOut.value = '';
        peopleCount.value = '';
    }
}





