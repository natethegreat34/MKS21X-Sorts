import java.util.Random;
public class Sorts{

  public static void selectionSort(int [] ary) {
  int end = ary.length -1;
  int i = 0;
  int small = 0;
  int l = 0;
  int place;
  String help = "";
  for (;i <= end; i++){
// for each place check if its smallest
    for (int x = 0; x + 1 <=end; x++){
      
      // if the specified place is bigger than something switch the two.
      if (ary [x] <= ary [x +1]){
        small = ary [x];
        place = x;
      }
      // once the smallest one is found enter it into the String
        help = help + ary [i];
    }
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
  int[] test = new int[20];
  for (int x = 0; x < 20; x++){
    test[x] = randgen.nextInt() % 20;
}
Random randge = new Random();
int[] lol = new int[20];
for (int x = 0; x < 20; x++){
  lol[x] = randge.nextInt() % 20;
}
System.out.println(toString (test));
selectionSort (test);
System.out.println(toString (test));
System.out.println("\n---------------------------------------------\n");
System.out.println(toString (lol));
selectionSort (lol);
System.out.println(toString (lol));
}
public static void bubbleSort(int[] data){
  int smallest = 0;
for (int i = 0; i + 1 < data.length; i ++){
    if (data[i] > data[i+1]){
      smallest = data [i+1];
      data [i+1] = data[i];
      data[i] = smallest;
    }

} }


}
