import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BalancedWordsCounter {

    public int count(String input) {
        if (input == null || !input.matches("([a-zA-Z]|^$)+")) {
            throw new RuntimeException();
        }


        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length()+1; j++) {
                String word = input.substring(i, j);
                if (isBalanced(word)) {
                    count++;
                }
            }
        }

        return count;
    }
    public boolean isBalanced(String word){
        if(word.equals("")){
            return false;
        }

        String[] letters = word.split("");
        Arrays.sort(letters);
        String s = "";
        List<String> wordParts = new ArrayList<>();
       for(String l : letters){
           if(s.equals("")){
               s += l;
               continue;
           }
           if(s.startsWith(l)){
               s+=l;
           } else {
               wordParts.add(s);
               s = l;
           }
       }
       if(!s.equals("")){
           wordParts.add(s);
       }


        int count = wordParts.get(0).length();
        for(String part : wordParts){
            if(part.length()!=count){
                return  false;
            }
        }
        return true;
    }
}
