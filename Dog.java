/**
 * Represents different dogs and their information 
 */
public class Dog{
  private String name; // the name of the dog breed
  private String bredFor; // what the dog is bred for
  private int minLS; //minimum amount of years the dog is alive for
  private int maxLS; //maximum amount of years the dog is alive for
  
  

    /** Constructor */
  public Dog(String name, String bredFor, int minLS, int maxLS){
    this.name = name;
    this.bredFor = bredFor;
    this.minLS = minLS;
    this.maxLS = maxLS;
   
   
  }
    /** Accessor Method for name */
  public String getName(){
    return name;
  }
    /** Accessor Method for bredFor */
  public String getBredFor(){
    return bredFor;
  }
    /** Accessor Method for minimum lifespan */
  public int getMinLS(){
    return minLS;
  }
      /** Accessor Method for maximum lifespan */
  public int getMaxLS(){
    return maxLS;
  }

  
  
    /** toString Method override */
  public String toString(){
    return "Dog Name: " + name + "\n"+
      "Bred For: " + bredFor + "\n"+
      "Minimum Lifespan: " + minLS + " years."+ "\n"+
      "Maximum LifeSpan: " + maxLS + " years.";
      
      
  }
  //to string showing name
  public String toStringName(){
    return "Dog Name: "+ name; 
  }
  //to string showing what the dog is bred for
  public String toStringBredFor(){
    return "Bred For: " + bredFor;
  }
  //to string showing min lifespan
  public String toStringMinLS(){
    return "Minimum Lifespan: " + minLS + " years.";
  }
//to string showing max lifespan
  public String toStringMaxLS(){
    return "Maximum Lifespan: " + maxLS + " years.";
  }

  
}