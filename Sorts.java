import java.util.Random;
public class Sorts{

  public static void selectionSort(int [] ary) {
  int small = 0;
  int place = 0;
  for (int i = 0; i < ary.length ; i++){
// for each place check if its smallest
        int smaller = ary [i];
    for (int x = i  ; x < ary.length; x ++){
      // if the specified place is smaller than the minimum.
      if (smaller > ary [x]){
        smaller = ary [x];
        place = x;
      }
}
      //Swapping
System.out.println("the min = " + smaller + " the place is = " + place );
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
int[] lol = new int[1];
for (int x = 0; x < 1; x++){
  lol[x] = randge.nextInt() % 4;
}
System.out.println(toString (test));
selectionSort (test);
System.out.println(toString (test));
System.out.println("\n---------------------------------------------\n");
System.out.println(toString (lol));
bubbleSort (lol);
System.out.println(toString (lol));
}
public static void bubbleSort(int[] data){
  int smallest = 0;
  boolean perfect = true;
  boolean allgood = false;
  //checks to see if in right order
  while(allgood == false){
  for (int i = 0; i + 1< data.length; i ++){
    if (data [i] > data [i+1]){
      perfect = false;
    }}
    if (perfect){allgood = true;}
    //Swapping
for (int i = 0; i + 1 < data.length; i ++){
    if (data[i] > data[i+1]){
      smallest = data [i+1];
      data [i+1] = data[i];
      data[i] = smallest;
    }}}}





}
