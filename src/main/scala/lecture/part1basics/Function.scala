package lecture.part1basics

object Function extends App {

  //一个function 也是一个code block
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())


  //只要想写loop，就写成这种iteration，另外这里在开头必须给出返回值类型
  def aRepeatedFunction(aString: String, n: Int): String = {
  if(n == 1) aString
  else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }



  def greetingForKids(name: String, age: Int): String = "hi, my name is " + name + " and i am " + age + " years old"
  println(greetingForKids("bobo", 12))

  def factorial(n: Int): Int = {
    if(n <= 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if(n <= 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  }
  println((4))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil((t - 1 ))
    }
    isPrimeUntil((n / 2))
  }
  println(isPrime(8))
  // isprimeuntil(4) -> 4 > 1, 8 % 4 = 0 -> false
  println(isPrime(7))
  //isprimeuntil(3) -> 3 > 1, 7 % 3 = 1 and isprimeuntil(2) -> 7 % 2 = 1


}
