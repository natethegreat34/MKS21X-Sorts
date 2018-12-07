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
  for (int x = 0; x < ary.length - 1; x--){
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
System.out.println(toString (test));
selectionSort (test);
System.out.println(toString (test));
}
public String Bubble (){;}
}
