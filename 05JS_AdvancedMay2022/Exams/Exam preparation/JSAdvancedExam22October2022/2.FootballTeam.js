class footballTeam {
    constructor(clubName, country) {
        this.clubName = clubName;
        this.country = country;
        this.invitedPlayers = [];
    }

    newAdditions(footballPlayers) {
        let result = [];
        for (const data of footballPlayers) {
            let [name, age, playerValue] = data.split('/');
            if (this.invitedPlayers.find(e => e.name == name)) {
                this.invitedPlayers.forEach(e => {
                    if (e.name == name && e.playerValue < playerValue) {
                        e.playerValue = playerValue;
                    }
                });
            } else {
                this.invitedPlayers.push({ name, age, playerValue });
            }

        }
        this.invitedPlayers.forEach(e => result.push(e.name));
        return 'You successfully invite ' + result.join(', ') + '.';
    }

    signContract(selectedPlayer) {

        let [name, playerOffer] = selectedPlayer.split('/');
        if (!this.invitedPlayers.find(e => e.name == name)) {
            throw new Error(`${name} is not invited to the selection list!`);
        }
        let result;
        this.invitedPlayers.forEach(e => {
            if (e.name == name) {
                if (e.playerValue > playerOffer) {
                    let priceDifference = e.playerValue - playerOffer;
                    throw new Error(`The manager's offer is not enough to sign a contract with ${name}, ${priceDifference} million more are needed to sign the contract!`);
                }
                e.playerValue = 'Bought';
                result = `Congratulations! You sign a contract with ${name} for ${playerOffer} million dollars.`
            }
        });
        return result;
    }

    ageLimit(name, age) {
        if (!this.invitedPlayers.find(e => e.name == name)) {
            throw new Error(`${name} is not invited to the selection list!`);
        }
        let result;
        this.invitedPlayers.forEach(e => {
            if (e.name == name && e.age < age) {
                let ageDifference = age - e.age;
                if (ageDifference < 5) {
                    result = `${name} will sign a contract for ${ageDifference} years with ${this.clubName} in ${this.country}!`
                }
                if (ageDifference > 5) {
                    result = `${name} will sign a full 5 years contract for ${this.clubName} in ${this.country}!`
                }
            } else if (e.name == name) {
                result = `${name} is above age limit!`;
            }

        });
        return result;
    }

    transferWindowResult() {
        let result = [];
        result.push('Players list:');
        this.invitedPlayers.sort((a, b) => a.name - b.name)
        .forEach(e => result.push(`Player ${e.name}-${(e.playerValue)}`));
        return result.join('\n');
    }
}
let fTeam = new footballTeam("Barcelona", "Spain");
console.log(fTeam.newAdditions(["Kylian Mbappé/23/160", "Lionel Messi/35/50", "Pau Torres/25/52"]));
console.log(fTeam.signContract("Kylian Mbappé/240"));
console.log(fTeam.ageLimit("Kylian Mbappé", 30));
console.log(fTeam.transferWindowResult());



