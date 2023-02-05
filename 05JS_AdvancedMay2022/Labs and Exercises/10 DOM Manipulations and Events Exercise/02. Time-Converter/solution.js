function attachEventsListeners() {
    let buttons = document.querySelectorAll('input[type = button]');
    //

    Array.from(buttons).forEach(b => b.addEventListener('click', buttonClick));
    function buttonClick(ev) {
        let currentButton = ev.target;
        let currentInputText = Number(ev.target.parentElement
            .querySelector('input[type = text]').value);
        let inputDays = document.querySelector('#days');
        let inputHours = document.querySelector('#hours');
        let inputMinutes = document.querySelector('#minutes');
        let inputSeconds = document.querySelector('#seconds');
        if (currentButton.id == 'daysBtn') {
            inputDays.value = currentInputText;
            inputHours.value = currentInputText * 24;
            inputMinutes.value = currentInputText * 1440;
            inputSeconds.value = currentInputText * 86400;
        } else if (currentButton.id == 'hoursBtn') {
            inputDays.value = currentInputText / 24;
            inputHours.value = currentInputText;
            inputMinutes.value = currentInputText * 60;
            inputSeconds.value = currentInputText * 3600;
        } else if (currentButton.id == 'minutesBtn') {
            inputDays.value = currentInputText / 1440;
            inputHours.value = currentInputText / 60;
            inputMinutes.value = currentInputText;
            inputSeconds.value = currentInputText * 60;
        } else if (currentButton.id == 'secondsBtn') {
            inputDays.value = currentInputText / 86400;
            inputHours.value = currentInputText / 3600;
            inputMinutes.value = currentInputText / 60;
            inputSeconds.value = currentInputText;
        }

    }
}