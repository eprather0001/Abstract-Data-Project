import org.code.theater.*;
import org.code.media.*;
/*
 * Represents a Scene to be played in the Theater using data from
 * the dogs dataset
 */
public class DataScene extends Scene {
  private Dog[] dogs; // 1D Array of Dogs Objects
  private String soundFile;

    /** Constructor */
  //sound file showed in video
    public DataScene(String soundFile) {
    this.soundFile = soundFile;
    dogs = createDogs();
  }
   /** Returns a 1D array of Dog objects using the txt files in my project */
 public Dog[] createDogs() {
    String[] nameArray = FileReader.toStringArray("name.txt");
    String[] bredForArray = FileReader.toStringArray("bredFor.txt");
    int[] minLSArray = FileReader.toIntArray("minLifeSpan.txt");
    int[] maxLSArray = FileReader.toIntArray("maxLifeSpan.txt");
    
   
   

   
   Dog[] dogsArray = new Dog[nameArray.length];
    for (int i = 0; i < dogsArray.length; i++) {
      dogsArray[i] = new Dog(nameArray[i], bredForArray[i], minLSArray[i], maxLSArray[i]);
    }

    return dogsArray;
  }

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {
    //displays a random dog breed and the information about it from the dataset
    int randomIndex = (int) (Math.random() * dogs.length);
    Dog d = dogs[randomIndex];
   

  
    

    //plays dog bark wav. files 
    playSound(soundFile);
    pause(0.5);
    //displays text for all the data sets 
    drawText(d.toStringName(), 20, 150);
    drawText(d.toStringBredFor(), 20, 200);
    drawText(d.toStringMinLS(), 20, 250);
    drawText(d.toStringMaxLS(), 20, 300);
    System.out.println(d);
  }

  /** Other Methods */
  



  
}