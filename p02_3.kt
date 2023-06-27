fun main() {
    print("Enter your age: ");
    var age:Int = readLine()!!.toInt();

    age = age + 1;

    println("Next year you will be $age years old.");
}