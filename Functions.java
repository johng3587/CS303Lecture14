
public class Functions {
 
   public static void testHashing(){
    System.out.println("\n\nTESTING HASHING"); 
     String str1 = new String("Cat");
    int h = str1.hashCode();
  	int N = (int)(Math.pow(2,3));

    System.out.println("Modulos(Hashcode) of " + h + " % " + N + " = " + h % N);
    System.out.println("Bitwise & of         " + h + " & " + (N-1) + " = " + (h & (N - 1)));

    }

    public static void testMyMap(){
        // Create a map
        System.out.println("\n\nTESTING MYMAP");        
        MyMap<String, Integer> map = new MyHashMap<>();

        System.out.println("Entries in map:       " + map);
        System.out.println("Size of map:          " + map.size());

        map.put("Smith", 30);
        map.put("Anderson", 31);
        map.put("Lewis", 29);
        map.put("Cook", 29);
        map.put("Smith", 65);
        map.put("George", 15);

        System.out.println("Entries in map:       " + map);
        System.out.println("Size of map:          " + map.size());

        System.out.println("The age for Lewis is  " + map.get("Lewis"));

        System.out.println("Is Smith in the map?  " + map.containsKey("Smith"));
        System.out.println("Is BoBo in the map?   " + map.containsKey("BoBo"));

        System.out.println("Is age 33 in the map? " + map.containsValue(33));
        System.out.println("Is age 65 in the map? " + map.containsValue(65));


        System.out.println("Removing George (15) & Anderson(31)");
        map.remove("Anderson");
        System.out.println("Entries in map:       " + map);
        System.out.println("Keys in map:          " + map.keySet());
        System.out.println("Values in map:        " + map.values());
   
        map.clear();
        System.out.println("Entries in map:       " + map);
    }

}
