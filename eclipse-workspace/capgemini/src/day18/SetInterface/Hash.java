package day18.SetInterface;

public class Hash {
	public static void main(String[] args)
    {
        // Creating an
        HashSet<String> hs = new HashSet<String>();
  
        // Adding elements to above Set
        // using add() method
        hs.add("Gift");
        hs.add("of");
        hs.add("God");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
  
        // Printing the elements of HashSet elements
        System.out.println("Initial HashSet " + hs);
  
        // Removing the element B
        hs.remove("B");
  
        // Printing the updated HashSet elements
        System.out.println("After removing element " + hs);
  
        // Returns false if the element is not present
        System.out.println("Element AC exists in the Set : "
                           + hs.remove("AC"));
    }

}
