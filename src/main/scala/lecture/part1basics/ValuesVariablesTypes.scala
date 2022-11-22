package lecture.part1basics

object ValuesVariablesTypes extends App {

  //value是不可变的值，variable是可以改变的变量

  //这里如果没有int，scala会自动给我们识别一个，但我觉得最好还是写详细点
  //规定了什么类型，就要赋值什么类型，不然会报错
  //可以写；，， 也可以不写；
  val x: Int = 16;
  println(x);

  val hello: String = "hello";
  println(hello);

  val boo: Boolean = true;

  val ch: Char = 'a';
  val aInt: Int = x;
  val  aShort: Short = 22;
  val aLong: Long = 33333333;
  //这里必须加f，不然会自动识别为double
  val aFloat: Float = 1.1f;
  //这里不用特地写f
  val aDouble: Double = 2.2;

  //variables
  var aVariable: Int = 4;
  aVariable = 3;//这是可以的，因为variable可变
  aVariable += 2;
  



}
