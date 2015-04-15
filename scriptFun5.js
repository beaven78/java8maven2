
function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.getFullName = function() {
        return this.firstName + " " + this.lastName;
    }
}

//PASSING JAVASCRIPT OBJECT INTO JAVA METHOD
var person1 = new Person("Peter", "Parker");
MyJavaClass.fun4(person1);

var fun5 = function(){
    var person1 = Person("Kate","Griffiths");
    MyJavaClass.fun4();
};

// Full Name is: Peter Parker

