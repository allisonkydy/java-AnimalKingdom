package animalKingdom;

public class Bird extends Animal
{
  // constructor
  public Bird(String name, int yearDiscovered)
  {
    super(name, yearDiscovered);
  }

  // methods
  @Override
  public String move()
  {
    return "flies";
  }

  @Override
  public String breathe()
  {
    return "breathes with lungs";
  }

  @Override
  public String reproduce()
  {
    return "lays eggs";
  }

  @Override
  public String toString()
  {
    return "Bird{" +
           "name='" + name + '\'' +
           ", yearDiscovered=" + yearDiscovered +
           '}';
  }
}
