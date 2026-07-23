class Pair{

    int dist;
    int x;
    int y;

    Pair(int dist,int x,int y){
        this.dist=dist;
        this.x=x;
        this.y=y;
    }
}

class Solution {

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Pair> maxHeap =
        new PriorityQueue<>(
        (a,b)->b.dist-a.dist);

        for(int[] point:points){

            int x=point[0];
            int y=point[1];

            int dist=x*x+y*y;

            maxHeap.offer(new Pair(dist,x,y));

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int[][] ans=new int[k][2];

        int i=0;

        while(!maxHeap.isEmpty()){

            Pair p=maxHeap.poll();

            ans[i][0]=p.x;
            ans[i][1]=p.y;

            i++;
        }

        return ans;
    }
}