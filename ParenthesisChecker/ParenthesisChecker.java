class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        //Hashmap to store the parenthesis
        HashMap<Character, Character> dict = new HashMap<Character, Character>();
        dict.put(']', '[');
        dict.put('}', '{');
        dict.put(')', '(');
        
        //Stack for storing the characters from string
        Stack<Character> stack = new Stack<Character>();
        
        if(x.length() < 2) {
            return false;
        }
        
        for(int i=0; i < x.length(); i++) {

            if(dict.containsKey(x.charAt(i)) && stack.size() > 0){
                Character charac = stack.peek();
                //System.out.println(charac);
                if(charac == dict.get(x.charAt(i))) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                        //System.out.println("Poping " + charac);

                    }
                }

            } else {
                stack.push(x.charAt(i));
                //System.out.println("Pushing " + s.charAt(i));
            }
        }

        if(stack.size() > 0 ){
            return false;
        }

        return true;
        
    }
}
