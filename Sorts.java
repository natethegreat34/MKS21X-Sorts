import java.util.Random;
public class Sorts{

  public static void selectionSort(int [] ary) {
  int small = 0;
  for (int i = 0; i < ary.length ; i++){
// for each place check if its smallest
        int smaller = ary [i];
          int place = i;
    for (int x = i  ; x < ary.length; x ++){
      // if the specified place is smaller than the minimum.
      if (smaller > ary [x]){
        smaller = ary [x];
        place = x;
      }
}
      //Swapping

      ary [place] = ary [i];
      ary [i] = smaller;
    }
  }

public static String toString (int [] ary) {
  String yes = "";
  for (int x = 0; x < ary.length - 1; x++){
    yes = yes + ary[x] + ", ";
  }
  return "[" + yes + ary [ary.length - 1] +"]";
}

public static void main(String[] args) {
  Random randgen = new Random();
  int[] test = new int[10];
  for (int x = 0; x < 10; x++){
    test[x] = randgen.nextInt() % 10;
}
Random randge = new Random();
int[] lol = new int[10];
for (int x = 0; x < 10; x++){
  lol[x] = randge.nextInt() % 10;
}
Random andge = new Random();
int[] hod = new int[10];
for (int x = 0; x < 10; x++){
  hod[x] = andge.nextInt() % 10;
}
System.out.println(toString (test));
selectionSort (test);
System.out.println(toString (test));
System.out.println("\n---------------------------------------------\n");
System.out.println(toString (lol));
bubbleSort (lol);
System.out.println(toString (lol));
System.out.println("\n---------------------------------------------\n");
System.out.println(toString (hod));
insertionSort (hod);
System.out.println(toString (hod));
}
public static void bubbleSort(int[] data){
  int smallest = 0;
  boolean no = false;
  boolean allgood = false;
  //checks to see if in right order
for (int turns = 0; allgood == false; turns ++){
  for (int x = 0; x + 1< data.length; x ++){
    if (data [x] > data [x+1]){
      no = true;
    }}
    if (no == false){allgood = true;}

    //Swapping
else{
for (int i = 0; i + 1 < data.length; i ++){
    if (data[i] > data[i+1]){
      smallest = data [i+1];
      data [i+1] = data[i];
      data[i] = smallest;
  }}
no = false;}
}
}


public static void insertionSort (int[] ary){
  boolean found = false;
  int current = 0;
  for (int i = 1; i < ary.length; i++ ){
    found = false;
    current = ary[i];
      for (int x = 0; x < i && !found; x ++){
        //what ever is the left most number that current is less than, shift everything between that number and the current one over to ther right.
        if (current < ary [x]){
          for (int n = i; n - 1 >= x; n -- ){
            ary [n] = ary [n - 1];
}
      // then enter the current into the space before the number it is less than.
            ary [x] = current;
          found = true;
        }
      }
    }

      }
  }
