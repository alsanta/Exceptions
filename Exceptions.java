import java.util.ArrayList;

public class Exceptions{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            // We are trying to make the items in the list into Integers using a for loop
            try{
                Integer castedValue = (Integer) myList.get(i);
            // If it works it gets printed
            // The try and catch in this case is in the for loop
                System.out.println(castedValue);
            // Normally it wouldnt work but since we catch the error here it'll keep going and we
            // Have it printing which index is the problem
            }catch (ClassCastException e){
                System.out.println(String.format("Error caught at index %d",i));
            }
        }
    }
}
