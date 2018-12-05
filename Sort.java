public class Sort{

  public static void selectionsort(int [] ary) {
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
  for (int n = ary.length/2; n < 0 ; n --){
    place = ary[l];
    ary[l] = ary [ary.length - 1 - l];
    ary [ary.length - 1 - l] = place;
  }
}


    public static void main(String[] args) {
    		int[] a = {9, 59, 10, 3, 33, -2, 4, 1};
    		selectionsort(a);
    		for (int i : a) System.out.println(i);
    	}



}
