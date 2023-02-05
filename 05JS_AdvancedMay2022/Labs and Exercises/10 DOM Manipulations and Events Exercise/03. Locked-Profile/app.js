function lockedProfile() {
    Array.from(document.querySelectorAll('.profile button'))
        .forEach(b => b.addEventListener('click', onClick));

    function onClick(ev) {
        let profile = ev.target.parentElement;
        let isLock = profile.querySelector('input[value = "lock"]').checked;
        if (!isLock) {
            let hiddenEl = Array.from(profile.querySelectorAll('div'))
                .find(e => e.id.includes('HiddenFields'));
            if (ev.target.textContent === 'Show more') {
                ev.target.textContent = 'Hide it';
                hiddenEl.style.display = 'block';
            } else {
                ev.target.textContent = 'Show more';
                hiddenEl.style.display = 'none';
            }
        }
    }
}