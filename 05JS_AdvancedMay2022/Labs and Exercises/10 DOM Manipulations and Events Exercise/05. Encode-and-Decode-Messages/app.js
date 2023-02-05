function encodeAndDecodeMessages() {
    let textAreas = document.getElementsByTagName('textarea');
    let buttons = Array.from(document.querySelectorAll('button'));

    buttons[0].addEventListener('click', encode);
    buttons[1].addEventListener('click', decode);

    function encode() {
        let newArrEncode = '';
        let str = textAreas[0].value;
        for (let i = 0; i < str.length; i++) {
            let asci = str.charCodeAt(i) + 1;
            newArrEncode += String.fromCharCode(asci);
        }
        textAreas[1].value = newArrEncode;
        textAreas[0].value = '';
    }
    function decode() {
        let newArrDecode = '';
        let str = textAreas[1].value;
        for (let i = 0; i < str.length; i++) {
            newArrDecode += String.fromCharCode(str.charCodeAt(i) - 1);
        }
        textAreas[1].value = newArrDecode;
    }
}