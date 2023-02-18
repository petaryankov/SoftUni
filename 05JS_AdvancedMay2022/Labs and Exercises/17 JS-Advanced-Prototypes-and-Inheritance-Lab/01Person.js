function createPerson(firstName, lastName) {
   
    obj = {
        firstName,
        lastName,
    }
    Object.defineProperty(obj, 'fullName', {
        get() {
            return this.firstName + ' ' + this.lastName;
        },
        set(value) {
            let [firstName, lastName] = value.split(' ');
            if (firstName != undefined && lastName != undefined) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }
    });
    return obj;
}
let person = createPerson("Peter", "Ivanov");
console.log(person.fullName); //Peter Ivanov
person.firstName = "George";
console.log(person.fullName); //George Ivanov
person.lastName = "Peterson";
console.log(person.fullName); //George Peterson
person.fullName = "Nikola Tesla";
console.log(person.firstName); //Nikola
console.log(person.lastName); //Tesla
