public class StringBuilderVSStringBuffer {
    public static void main(String[] args) {
        /*
         * StringBuffer
         * integrated since JDK 1.0 V
         * Syncronized (only one thread can operate, no simultaneous operation can happen)
         * this is THREAD SAFE (at a time only one thread can perform, other threads have to wait)
         * performance is low
         * 
         * opt it when content chnages frequently but thread safety is required
         */ 

         /*
          * StringBuilder
         * integrated since JDK 1.5 V
         * Unsyncronized (multithread can operate, simultaneous operations can happen)
         * this is  not THREAD SAFE (Multiple threads can perform at a single point of time)
         * performance is high
         * 
         * opt it when content chnages frequently but thread safety is NOT required
          */

          
    }
}
