//Minimum number of increments to make all array elements equal

import java.util.*;

public class Program1 {
  public static void main(String []args){
         
        Scanner sc= new Scanner(System.in);
        List<Integer> intList= new ArrayList<Integer>();
        System.out.println("Enter array elements followed by a non integer");
        while(sc.hasNextInt()){
            intList.add(sc.nextInt());
        /*intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);*/
        /*for(int i: intList){
            System.out.print(i + " ");
        }*/
        System.out.println();
        
        System.out.println("Minimum number of increments are" + count(intList));
     }
     
     public static int count(List<Integer> intList ){
         int counter=0;
         while(!check(intList)){
             boolean flag=true;
             int max=findMax(intList);
             for(int i=0; i<intList.size(); i++){
                 if(intList.get(i)!=max || !flag){
                     intList.set(i,intList.get(i)+1);
                 }
                 else if(flag){
                     flag=false;
                 }
             }
             for(int i: intList){
                 System.out.print(i + " ");
             }
             System.out.println();
             counter++;
         }
         return counter;
     }
     
     public static int findMax( List<Integer> intList ){
         int max=-99;
         for(int i : intList){
             if(i>max)
                max=i;
         }
         return max;
     }
     public static boolean check( List<Integer> intList ){
         int i=0;
         while(i<intList.size()-1){
         	if(intList.get(i)!=intList.get(++i)){
            	return false;
            }
         }
         return true;
     }
}
