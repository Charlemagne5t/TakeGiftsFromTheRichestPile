import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res = 0L;
        PriorityQueue<Integer> pq = new PriorityQueue(Comparator.comparingInt((Integer a) -> -a));
        for(int x : gifts){
            pq.offer(x);
        }
        while(k != 0) {
            int val = (int) Math.sqrt(pq.poll());
            pq.offer(val);
            k--;
        }
        while(!pq.isEmpty()){
            res += pq.poll();
        }

        return res;
    }
}