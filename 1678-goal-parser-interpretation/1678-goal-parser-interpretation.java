class Solution {
    public String interpret(String command) {
        String r="";
        for(int i =0; i<command.length();i++){
            
            if(command.charAt(i)=='G'){
                r+="G";
            }else if(command.charAt(i)=='('){
                
                if(command.charAt(i+1)==')'){
                    r+="o";
                    i++;
                }else{
                    
                    r+="al";
                    i+=3;
                    
                }
            }
        }
        return r;

    }
}