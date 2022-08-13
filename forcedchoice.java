// import java.sql.Array;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;

// public class forcedchoice {
// public static int[] deleteElement(int[] originalArray, int deleteIndex) {
// if (originalArray == null || deleteIndex < 0 || deleteIndex >=
// originalArray.length){
// return originalArray;
// }
// List<Integer> elementList = IntStream.of(originalArray).boxed()
// .collect(Collectors.toList());
// elementList.remove(deleteIndex);
// return elementList.stream().mapToInt(Integer::intValue).toArray();
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int N= sc.nextInt(),P= sc.nextInt(),S= sc.nextInt();
// Integer[] l=new Integer[N];
// for (int i = 1; i <= l.length; i++) {
// l[i]=i;
// }
// boolean d=true;
// for (int i = 0; i < S; i++) {
// int m=sc.nextInt();
// List<Integer> lst= new ArrayList<>();
// for (int j = 0; j < m; j++) {
// int b=sc.nextInt();
// if(b==P){
// d=false;
// }else{
// lst.add(b);
// }
// }

// Integer[] l=Array.removeElement(l, 7);
// }
// }
// }
