import java.util.Arrays;
public class Horror{

  public static void main(String[]artie){

    int[] randish = new int[Integer.parseInt(artie[0])];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*10000);
    }

    if(artie[1].equals("selection")){
      Sorts.selectionSort(randish);
    }
    if(artie[1].equals("bubble")){
      Sorts.bubbleSort(randish);
    }
    if(artie[1].equals("insertion")){
      Sorts.insertionSort(randish);
    }
    if(artie[1].equals("test")){
      int[] randish2 = Arrays.copyOf(randish,randish.length);
      int[] randish3 = Arrays.copyOf(randish,randish.length);
      int[] randish4 = Arrays.copyOf(randish,randish.length);
      Sorts.selectionSort(randish);
      Sorts.bubbleSort(randish2);
      Sorts.insertionSort(randish3);
      Arrays.sort(randish4);
      if( Arrays.equals(randish,randish4)){
        System.out.println("Selection Correct!");
      }
      if( Arrays.equals(randish2,randish4)){
        System.out.println("Bubble Correct!");
      }
      if( Arrays.equals(randish2,randish4)){
        System.out.println("Insertion Correct!");
      }
    }
  }
}

// TEST THIS STUFF:
// java Horror 10000 test
// time java Horror 10000 selection
// time java Horror 10000 insertion
// time java Horror 20000 selection
// time java Horror 20000 insertion
// time java Horror 40000 selection
// time java Horror 40000 insertion
// time java Horror 80000 selection
// time java Horror 80000 insertion
