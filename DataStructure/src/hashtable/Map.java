package hashtable;

import java.util.ArrayList;

public class Map <K,V> {
    private ArrayList<HashNode<K, V>> bucket;
    private int numberofbuckets;
    private int arraysize;
    private int bucketindex;


    public Map() {
        bucket = new ArrayList<>();
        numberofbuckets = 10;
        arraysize = 0;
        for (int i = 0; i < numberofbuckets; i++) {
            bucket.add(null);
        }

    }


    private int getbucketindex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % numberofbuckets;
        return index;
     }



    public void add(K key, V value) {
        int index=getbucketindex(key);
        HashNode<K, V> head = bucket.get(index);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        arraysize++;
        head = bucket.get(index);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;
        bucket.set(index, newNode);
    }

        public V get(K key) {
        int index = getbucketindex(key);
        HashNode<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }

    public V remove (K key) {
        int index = getbucketindex(key);
        HashNode<K, V> head = bucket.get(index);
        HashNode<K, V> temp=null;
        while (head != null) {
            if (head.key == key)
                break;
            temp=head;
            head = head.next;
        }
        if (head == null)
            return null;
        if(temp==null) {
            bucket.set(index,head.next);
            arraysize --;
        }
        else {
        temp.next=head.next;
        arraysize --;

        }
        return head.value;

    }
    public int size () {
        return arraysize; }
}
