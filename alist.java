import java.util.*;
public class Alist{
    Scanner sc = new Scanner(System.in);
    String str;
    public void append(ArrayList<String>al){
        System.out.println("Enter the string to be added: ");
        str=sc.nextLine();
        al.add(str);
    }
    public void insert(ArrayList<String>al){
        int index;
        System.out.println("Enter the index: ");
        index=sc.nextInt();
        System.out.println("Enter the string: ");
        str=sc.nextLine();
        if(index<=al)
            al.add(index,str);
        else
            al.add(al.size(),str);
    }
    public void search(ArrayList<String>al){
        System.out.println("Enter the string to be searched: ");
        str=sc.next();
        int i=0;
        for(String s: al){
            if(str.equal(s)){
                System.out.println("The string is present in"+i+"position of arraylist");
                return;
            }
            i++;
        }
        System.out.println("The string is not present in the list");
    }
    public void find(ArrayList<String>al){
        char letter;
        System.out.println("Enter the letter to find in the string.");
        letter=sc.next().charAt(0);
        System.out.println("The string starting with"+letter+"are: ");
        for(String s: al){
            if(letter==s.charAt(0))
                System.out.println(s);
        }
    }
}
