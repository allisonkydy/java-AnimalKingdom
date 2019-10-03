package animalKingdom;

public class Fish extends Animal
{
  // constructor
  public Fish(String name, int yearDiscovered)
  {
    super(name, yearDiscovered);
  }

  // methods
  @Override
  public String move()
  {
    return "swims";
  }

  @Override
  public String breathe()
  {
    return "breathes with gills";
  }

  @Override
  public String reproduce()
  {
    return "lays eggs";
  }

  @Override
  public String toString()
  {
    return "Fish{" +
           "name='" + name + '\'' +
           ", yearDiscovered=" + yearDiscovered +
           '}';
  }
}
