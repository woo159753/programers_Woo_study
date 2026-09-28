class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            answer++;
            
            //while문을 사용!
            while(true){
                
                //3의 배수인지 검사
                if(answer % 3 == 0){
                    answer++;
                    continue;
                }
                
                //3을 포함하고 있는지 검사
               int tmp = answer;
                while(tmp > 0){
                    if(tmp % 10 == 3){
                        answer++;
                        break;
                    }
                    tmp /= 10;
                }
                
                //숫자3을 발견했다면 처음부터 다시 검사
                if(tmp > 0) continue;
                
                break;
            }
        }
        return answer;
    }
}