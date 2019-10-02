package animalKingdom;

public class Mammal extends Animal
{
  // constructor
  public Mammal(String name, int yearDiscovered)
  {
    super(name, yearDiscovered);
  }

  // methods
  @Override
  public String move()
  {
    return (name + " walks");
  }

  @Override
  public String breathe()
  {
    return (name + " breathes with lungs");
  }

  @Override
  public String reproduce()
  {
    return (name + " gives birth to live young");
  }
}
