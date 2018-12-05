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
public String toString () {
  String yes = "";
  for (int x = 0; x < ary.length - 1; x++){
    yes = yes + ary[x] + ", ";
  }
  retrun "[" + yes + ary [ary.length -1] +"]";
}



}
