package animalKingdom;

public abstract class Animal
{
  // fields
  protected static int maxNumber = 0;
  protected int number;
  protected String name;
  protected int yearDiscovered;

  // constructor
  public Animal(String name, int yearDiscovered)
  {
    maxNumber++;
    number = maxNumber;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }
  
  // method with default behavior
  public String consumeFood()
  {
    return (name + " eats some food");
  }

  // abstract methods - implemented in children
  public abstract String move();
  public abstract String breathe();
  public abstract String reproduce();
}
