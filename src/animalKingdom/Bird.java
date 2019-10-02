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
    return (name + " flies");
  }

  @Override
  public String breathe()
  {
    return (name + " breathes with lungs");
  }

  @Override
  public String reproduce()
  {
    return (name + " lays eggs");
  }
}
