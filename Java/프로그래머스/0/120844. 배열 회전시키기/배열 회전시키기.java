class Solution {
    public int[] solution(int[] numbers, String direction) {
        switch(direction){
            case "right":
                int tmp1 = numbers[numbers.length - 1];
                for(int i = numbers.length - 1; i > 0; i--){
                    numbers[i] = numbers[i-1];
                }
                numbers[0] = tmp1;
                break;
            case "left":
                int tmp2 = numbers[0];
                for(int i = 0; i < numbers.length - 1; i++){
                    numbers[i] = numbers[i+1];
                }
                numbers[numbers.length - 1] = tmp2;
                break;
        }
        int[] answer = numbers;
        return answer;
    }
}