/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author spencer
 */
import java.util.*;
public class PROJECT {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       
    
    List<String> list = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    
    
    
    
    //part 1 LIST
    //These statements allow the user to add items to a list
    System.out.print("enter a food \n");
    for(int i =5; i>0;i-- ){
        
            list.add(in.nextLine());
        if( i==1){
            break;
        }
        else
            System.out.print("enter another food \n");      
        }
    //Sorting the list in alphabetical order.
    Collections.sort(list);
    
    //printing the list.
    for (int j =0; j<5; j++){
        System.out.printf("%s ", list.get(j));    
    }
    
    System.out.printf("\n\nThis demonstrates the functionality of a list."
            + "\nItems were added to a list that didn't have to be pre-defined like an array would."
            + "\nThey were then sorted using the Collections.sort method and printed out.\n\n");
    
    //Part 2 Set
    
    Set<String> set = new HashSet<>();
    //these statements have the user add items to a set
    System.out.print("type a word\n");
    for(int i =3; i>0;i-- ){
        set.add(in.nextLine());
        if( i==1){
            break;
        }
         else if(i==2){
            System.out.print("Enter the same word\n");      
        }
         else {
            System.out.print("Enter a different word\n");
         }
        
    }
        //iterates through the list and outputs
            Iterator<String> ite = set.iterator(); 
        while (ite.hasNext()) 
            System.out.printf("%s ", ite.next()); 
        System.out.print("\nThis shows the functionality of a set."
                + "\nA set does not allow you to add multiple identical items.\n\n");
        
        //Part 3 Queue
    
        // creating the Queue and having the user add names to it
        Queue<String> q = new LinkedList<>();
        System.out.print("Add 5 names to a Queue, Press enter after typing each item.\n");
        for(int l=0; l<5; l++){
            q.add(in.nextLine());
        }
        
        //Printing out the orignal q as entered
        System.out.print("\n This is the current q - " + q
                + "\n Member in front of queue- " + q.peek());
        
        //removing two items from the q
        q.remove();
        q.remove();
        
        //Priting out the new q with items removed
        System.out.print("\n\n Two names were removed from the q - " + q
                + "\n Member in front of the queue now - " + q.peek());
        
        System.out.print("\nThis shows the functionality of a queue."
                + "\nA Queue have a priority system that adds new items to the"
                + "\n back and removes items in the front. First in First out.\n\n");
        
        
    
        //Part 4 Map
        
        System.out.print("\nThe following code creates a HashMap. "
                + "\nIt adds 4 names(keys) and gives each name a value");
        
        //creating the hash map and adding keys and values
        Map< String, String> map = new HashMap<>();
        
        String val1 = "Graduate";
        String val2 = "Attending";
        map.put("Michael", val1);
        map.put("James", val1);
        map.put("Tom",val2);
        map.put("Edger", val2);
        
        
        //explination
        System.out.print("\n\n" + map.entrySet());
        System.out.print("\n\nLike Sets, maps can't have duplicate keys." 
                + "\nHowever, They can have duplicate values as you can see."
                + "\nIf you were to add a key where one exists it would overwrite"
                + "\nthe existing key with the new value. For example, the next"
                + "\ncode will re-add Tom with the value of Graduate instead of Attending");
        //"Changing" Tom
        map.put("Tom", val1);
        System.out.print("\n\n" + map.entrySet());
        
        System.out.print("\n\nThis shows the functionality of a map."
                + "\nEach key has an associated value, Keys can't be duplicated"
                + "\nbut values can. This is useful when you need association between items\n\n");
        
        //Part 5  TreeSet
        //creating a treeset
        TreeSet<String> tree = new TreeSet<>(); 
         
        //adding items to the set
        tree.add("Simon"); 
        tree.add("Alvin"); 
        tree.add("1");
        tree.add("Theo");
        
        
  
        
  
        
        // Items are printed and sorted in ascending and then decending order
        System.out.println(tree);
        System.out.println(tree.descendingSet());
        
        System.out.print("\n\nThis demonstrates a tree but dosen't really show its functionality."
                + "\ntrees seem to be designed when you need larger sets for searchability"
                + "\nand performance. I am not sure how to demo on a small scale\n\n");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
            
            
    
  
    
        
        
    }
    

