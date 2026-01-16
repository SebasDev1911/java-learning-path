package classWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,8,9,10};
        
        int sum = 0;
        
        for(Integer i:integers){
            if(i.intValue() % 2 == 0){
                sum += i.intValue();
            }
        }
        System.out.println("sum = " + sum);
    }
}
