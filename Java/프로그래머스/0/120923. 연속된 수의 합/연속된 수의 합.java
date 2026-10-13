class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if(num % 2 == 0){
            int half = num / 2;
            int sumOfTow = total / half;
            int middle = sumOfTow / 2;
            int start = middle - half + 1;
                
            for(int i = 0; i < answer.length; i++){
                answer[i] = start++;
            }
        }else{
            int half = num / 2;
            int middle = total / num;
            int start = middle - half;
            
            for(int i = 0; i < answer.length; i++){
                answer[i] = start++;
            }
            
        }
        return answer;
    }
}