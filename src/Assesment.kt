fun main(){
    introduction("Loyce Velma",18)
    students(4)
    students(12)
    students(24)
    operation(20,3)
    Human("Loyce",18,59)
var person=Human("Tabbi",20,45)

}
fun introduction(name:String,age:Int){
    println("My name is $name and am $age years old")
}
fun students(age: Int){
    if (age<6){
        println("milk")
    }
    else if(age>6 && age<15){
        println("Fanta")
    }
    else{
        println("Cocacola")
    }

}
//fun jina(a:String,b:String,c:String){
     //var namesArray=arrayOf(a,b,c)
   // var name=namesArray.length
   // println(name)//
//}
fun operation(num1:Int,num2:Int){
    var sum=num1+num2
    var product=num1*num2
    var modulus=num1%num2
    println(sum)
    println(product)
    println(modulus)

}
class Human(name:String,age:Int,weight:Int){
    fun eat(foodWeight:Int) {
        println("I am eating $foodWeight Kgs of food")
    }
    fun speak(speech:String){
        println("I love myself")
    }
    //fun birthday(){
       // var age=birthday//
    }//



//}