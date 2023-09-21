package inClassExcersise;

public class Counter {
    
    private int [] data;

    public Counter (int sz){

        data = new int[sz];
    }

    public void increment(){
        int i = 0;
        boolean carry = true;
        while (carry){
            data[i]++;
            if (data[i]== 10){
                data[i]= 0;
                i++;
                if (i == data.length){
                    System.out.println("overflow");
                    carry = false;
                }
            }
            else{
                carry = false;
            }
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = data.length - 1 ; i >= 0; i--){
            s.append(data[i]);
        }
        return s.toString();
    }

    public void reset(){
        data = new int[data.length];
    }
}
