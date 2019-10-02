package animalKingdom;

import java.util.ArrayList;

public class Main
{
  public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
  {
    for (Animal a : animals)
    {
      if (tester.test(a))
      {
        System.out.println(a.toString());
      }
    }
  }

  public static void main(String[] args)
  {
    // create mammals
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);

    // create birds
    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    // create fish
    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    // create arraylist of type Animal and add all the animals
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(panda);
    animals.add(zebra);
    animals.add(koala);
    animals.add(sloth);
    animals.add(armadillo);
    animals.add(raccoon);
    animals.add(bigfoot);
    animals.add(pigeon);
    animals.add(peacock);
    animals.add(toucan);
    animals.add(parrot);
    animals.add(swan);
    animals.add(salmon);
    animals.add(catfish);
    animals.add(perch);

    // animals.forEach(a -> System.out.println(a.toString()));

    // lambda expresssions:

    // List all the animals in descending order by year named
    System.out.println("\nAnimals sorted by year: \n");
    animals.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
    animals.forEach(a -> System.out.println(a.toString()));

    // List all the animals alphabetically
    System.out.println("\nAnimals sorted alphabetically: \n");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals.forEach(a -> System.out.println(a.toString()));

    // List all the animals order by how they move
    System.out.println("\nAnimals sorted by movement type: \n");
    animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    animals.forEach(a -> System.out.println(a.getName() + " " + a.move()));

    // List only those animals the breath with lungs
    System.out.println("\nAnimals that breathe with lungs: \n");
    printAnimals(animals, a -> a.breathe() == "breathes with lungs");

    // List only those animals that breath with lungs and were named in 1758
    System.out.println("\nAnimals that breathe with lungs and were named in 1758: \n");
    printAnimals(animals, a -> (a.breathe() == "breathes with lungs" && a.getYearDiscovered() == 1758));

    // List only those animals that lay eggs and breath with lungs
    System.out.println("\nAnimals that lay eggs and breathe with lungs: \n");
    printAnimals(animals, a -> (a.reproduce() == "lays eggs" && a.breathe() == "breathes with lungs"));

    // List alphabetically only those animals that were named in 1758
    System.out.println("\nAnimals that were named in 1758: \n");
    printAnimals(animals, a -> a.getYearDiscovered() == 1758);

  }
}
