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
    return (name + " swims");
  }

  @Override
  public String breathe()
  {
    return (name + " breathes with gills");
  }

  @Override
  public String reproduce()
  {
    return (name + " lays eggs");
  }
}
