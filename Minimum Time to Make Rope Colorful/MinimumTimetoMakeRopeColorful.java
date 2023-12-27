class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] ch=colors.toCharArray();
        int count = 0,  minTime = neededTime[0];
        for(int i =0; i<neededTime.length-1;i++){
            if(ch[i]==ch[i+1]){
                count += Math.min(minTime,neededTime[i+1]);
                minTime = Math.max(minTime,neededTime[i+1]);
            }
            else{
                minTime =neededTime[i+1];
            }
        }
        return count;
    }
}
