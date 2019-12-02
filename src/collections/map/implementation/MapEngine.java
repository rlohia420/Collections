package collections.map.implementation;

public class MapEngine {
    public static void main(String[] args) 
    { 
        MapImplementation<Integer, String> map = new MapImplementation(5); 
        map.insert(1, "Neha"); 
        map.printMap(); 
        map.insert(2, "Lohia"); 
        map.printMap(); 
        map.insert(3, "A"); 
        map.printMap(); 
        map.insert(4, "Computer"); 
        map.printMap(); 
        map.insert(5, "Science"); 
        map.printMap(); 
        System.out.println("key : "+4 +" value : "+ map.get(4));
    } 
}
