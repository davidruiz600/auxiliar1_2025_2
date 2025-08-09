object Yapper {

  val greeting:String=""
  val farewell:String=""
  def main(args: Array[String]): Unit = {
    println("Hello my fellow memeros")
    gregory("Juan")
    fear(32)
    fear(-32)
  }
  def gregory(nombre: String):Unit={
    println(s"Hello $nombre")
  }
  def say(something:String):Unit={

  }
  def fear(momo:Int):Unit={
    if (momo>=0){
      println("Hola, soy el momo")
    }else{
      println("Hola, no soy el momo")
    }
  }
}//Hola