class Car
{
  public void carModel()
  {
    System.out.println("The car models");
  }
}

class Honda extends Car
{
  public void carModel()
  {
    System.out.println("Honda is expensive");
  }
}

class Toyota extends Car
{
  public void carModel()
  {
    System.out.println("Toyota is cheaper");
  }
}

class runtimePoly
{
  public static void main(String[] args)
  {
    Car myCar = new Car();
    Car myHonda = new Honda();
    Car myToyota = new Toyota();
    myCar.carModel();
    myHonda.carModel();
    myToyota.carModel();
  }
}