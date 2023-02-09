function printDeckOfCards(cards) {
    let result = [];
    for (const data of cards) {
        const face = data.slice(0, -1);
        const suit = data.slice(-1);
        try {
            const card = createCard(face, suit);
            result.push(card);
        } catch (err) {
            result = [`Invalid card: ${data}`]
        }
    }
    console.log(result.join(' '));
    function createCard(face, suit) {
        const faces = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A'];
        const suits = {
            'S': '\u2660',
            'H': '\u2665',
            'D': '\u2666',
            'C': '\u2663',
        }
        if (!faces.includes(face) || !suits[suit]) {
            throw new Error('Error');
        }
        return {
            face,
            suit: suits[suit],
            toString() {
                return this.face + this.suit;
            }
        }
    }
}
printDeckOfCards(['AS', '10D', 'KH', '2C']);
printDeckOfCards(['5S', '3D', 'QD', '1C']);