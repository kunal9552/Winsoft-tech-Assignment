import java.util.*;

class Que3
{
    public static void main(String[] args)throws Exception
    {
        String str = "Hello, my name is kunal";

        Map<String,Integer> hm = new HashMap<>();
        
        String[] words = str.split(" ");

        for(String word : words )
        {
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            Integer Count = hm.get(word);
            if(Count == null)
            {
                Count = 0;
            }
            hm.put(word,Count+1);
        }

        for(int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
        System.out.println(hm);
    }
}