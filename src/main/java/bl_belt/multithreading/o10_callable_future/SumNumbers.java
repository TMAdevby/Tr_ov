package bl_belt.multithreading.o10_callable_future;

import java.util.concurrent.Callable;

public class SumNumbers {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) {

    }
}

class PartialSum implements Callable<Long>{
    long from;
    long to;
    long localSum;
    public PartialSum(long from, long to){
        this.from = from;
        this.to = to;
    }
    public Long call(){
        for(long i = from; i<=to; i++){
            localSum += i;
        }
        System.out.println("Sum from " + from + " to" + to + " = " + localSum);
    }
}