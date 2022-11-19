object demoClassObject {
  def main(args: Array[String]): Unit = {
    println("Test Object..")
    var bmw = new Car
    bmw.topClassExtraCost=500;
    var result = bmw.cost(10000)
    println("===>"+result)
  }
}

class  Car  {

  var topClassExtraCost = 0;
  private var roadTax = 100;

  def cost(basicPrice: Int)= basicPrice+topClassExtraCost+roadTax;
}

