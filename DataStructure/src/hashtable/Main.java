package hashtable;

public class Main {
    public static void main (String[] args){
        Map <String,Integer> map=new Map <> ();
        map.add("HI",124);
        map.add("bye", 230);
        map.add("yes",17);
        System.out.println(map.get("HI"));
        System.out.println(map.get("bye"));
        System.out.println(map.size());
        map.remove("bye");
        System.out.println(map.size());
        System.out.println(map.get("bye"));


    }
}
