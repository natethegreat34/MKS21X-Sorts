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

    for (int x = 0; x <=end; x++){
      if (ary[i] > ary [x]){
        small = ary [x];
        ary [x] = ary [i];
        ary[i] = small;
      }
        help = help + ary [i];
    }
  }
}
public static String toString (int [] ary) {
  String yes = "";
  for (int x = ary.length - 1; x > 0; x--){
    yes = yes + ary[x] + ", ";
  }
  return "[" + yes + ary [0] +"]";
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

}
