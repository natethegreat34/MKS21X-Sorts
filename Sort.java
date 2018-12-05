public class Sort{

  public static void selectionsort(int [] ary) {
  int end = ary.length -1;
  int i = 0;
  int small = 0;
  int l = 0;
  int place;
  for (;i <= end; i++){
    for (int x = 0; x <=end; x++){
      if (ary[i] > ary [x]){
        small = ary [x];
        ary [x] = ary [i];
        ary[i] = small;
      }}}}}
