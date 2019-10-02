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
  
  // methods with default behavior
  public String consumeFood()
  {
    return (name + " eats some food");
  }

  // getters and setters
  public int getNumber()
  {
    return number;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getYearDiscovered()
  {
    return yearDiscovered;
  }

  public void setYearDiscovered(int yearDiscovered)
  {
    this.yearDiscovered = yearDiscovered;
  }

  @Override
  public String toString()
  {
    return "Animal{" +
           "name='" + name + '\'' +
           ", yearDiscovered=" + yearDiscovered +
           '}';
  }

  // abstract methods - implemented in children
  public abstract String move();
  public abstract String breathe();
  public abstract String reproduce();
}
