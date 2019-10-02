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
    return "walks";
  }

  @Override
  public String breathe()
  {
    return "breathes with lungs";
  }

  @Override
  public String reproduce()
  {
    return "gives birth to live young";
  }
}
