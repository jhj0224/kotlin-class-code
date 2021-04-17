

fun main() {
    val person1 = Person();
    person1.id = 1;
    person1.name = "철수"
    person1.gender = "남자"
    person1.age = 23
    person1.hometown = "철원"
    println(person1)

    val person2 = Person();
    person2.id = 2;
    person2.name = "영희"
    person2.gender = "여자"
    person2.age = 22
    person2.hometown = "남원"
    println(person2)

    val person3 = Person();
    person3.id = 3;
    person3.name = "영수"
    person3.gender = "남자"
    person3.age = 25
    person3.hometown = "진천"
    println(person3)
}

class Person {
    var id : Int = 0;
    var name : String = ""
    var gender : String = ""
    var age : Int = 0;
    var hometown : String = ""

    override fun toString(): String {
        return "id: $id, name: $name, gender : $gender, age : $age, hometown : $hometown"
    }

}