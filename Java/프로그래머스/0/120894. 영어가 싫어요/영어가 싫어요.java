class Solution {
    public long solution(String numbers) {
        long answer = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < numbers.length(); i++){
            char ch = numbers.charAt(i);
            
            switch(ch){
                //0
                case 'z' :
                    sb.append('0');
                    i += 3;
                    break;
                //1
                case 'o' :
                    sb.append('1');
                    i += 2;
                    break;
                //2,3
                case 't' : 
                    if(numbers.charAt(i+1) == 'w'){
                        sb.append('2');
                        i += 2;
                    }else{
                        sb.append('3');
                        i += 4;
                    }
                    break;
                //4,5
                case 'f' :
                    if(numbers.charAt(i+1) == 'o'){
                        sb.append('4');
                        i += 3;
                    }else{
                        sb.append('5');
                        i += 3;
                    }
                    break;
                //6,7
                case 's' :
                    if(numbers.charAt(i+1) == 'i'){
                        sb.append('6');
                        i += 2;
                    }else{
                        sb.append('7');
                        i += 4;
                    }
                    break;
                //8
                case 'e' :
                    sb.append('8');
                    i += 4;
                    break;
                //9
                case 'n' :
                    sb.append('9');
                    i += 3;
                    break;
            }
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}