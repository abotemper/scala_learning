package lecture.part1basics


//extends App 以后可以让 这个程序runnable
object Expressions extends App {
  val x = 1 + 2;//expression
  println(x)

  var aVar: Int = 2;
  aVar += 4;
  println(aVar);

  //instructions(Do) vs expressions(a value or a type)

  //if expression
  val aCondition: Boolean = true;
  val aConditionValue: Int = if(aCondition) 5 else 3;
  println((aConditionValue))

  println(if(aCondition) 5 else 3);

//在scala中这是个非常垃圾的写法，后面会学
  var i = 0;
  while (i < 10) {
    println(i)
    i += 1
  }

  //所有的东西都是expression

  val aWeirdVlaue = (aVar = 3);//这里返回了一个unit 其实就是void
  println((aWeirdVlaue))

  // code blocks

  val aCodeBlock = {
    val y = 2;
    val z = y + 1;
//这里的z只在这里好使，出了block，别的地方用不上了
    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vd println("hello world),前者是string，后者是unit
  //2.
  val someValue = {
    2 < 3;
  }
  //above is true

  //42, a int
  println((someValue))
  val someOtherValue = {
    if(someValue) 23 else 90;
    42;
  }
  println((someOtherValue))
}
