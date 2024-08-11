package collection_code.cursors.list;

import java.util.*;

public class ArrayListOperation {

    public static void main(String[] args) {

        //ADD ELEMENT
        ArrayList<Integer> arrayList = new ArrayList<>() ;

        arrayList.add(1) ;

        arrayList.addAll(0, List.of(2,3,4,5)) ;

        System.out.println(arrayList) ;

        //SET ELEMENT
        ArrayList<String> vowels = new ArrayList<>(List.of("a","b","c","d","f")) ;

        vowels.set(1, "e") ;
        vowels.set(2,"i") ;
        vowels.set(3,"o") ;
        vowels.set(4,"u") ;

        System.out.println(vowels);

        //REMOVE ELEMENT
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("a","d","v","2","5")) ;

        alphabets.remove(3);
        alphabets.remove("5") ;
        alphabets.removeAll(List.of("d","v")) ;
        System.out.println(alphabets);
        alphabets.clear();
        System.out.println(alphabets);

        // ITERATE ELEMENT
        List<String> stringList = new ArrayList<>(List.of("q","i","w","vg","j")) ;

        stringList.forEach(System.out::println) ;

        stringList.stream().forEach(e-> System.out.println(e)) ;

        ListIterator<String> listIterator = stringList.listIterator() ;

        while (listIterator.hasNext()){

            if (listIterator.next().equalsIgnoreCase("J"))
                listIterator.remove() ;
        }

        System.out.println(stringList) ;


        //STREAM

        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        List<Integer> evenNumber = integers.stream().filter(e-> e%2 == 0).toList() ;

        System.out.println(evenNumber) ;

        List<Integer> squareRoot = evenNumber.stream().map(e->e*e).toList() ;
        System.out.println(squareRoot) ;

        //Searching

        List list = Arrays.asList(1,5,4,7,9,8) ;
        System.out.println(list.contains(5));
        System.out.println(list.containsAll(List.of(1,5,7,8)));

        Collections.sort(list);
        int index = Collections.binarySearch(list,4) ;
        System.out.println(index);

        //Sorting

        ArrayList<Integer> sortingNumber = new ArrayList<>(List.of(1,4,5,6,7,8,90,84)) ;
         Collections.sort(sortingNumber);
        System.out.println(sortingNumber);


         Item item = new Item("mixture",150,new Brand("Saraswati")) ;
        Item item1= new Item("Tea",50,new Brand("Nestle")) ;
        Item item2 = new Item("Biscit",5,new Brand("Oreo")) ;

        List<Item> items = Arrays.asList(item,item1,item2) ;

        Comparator<Item> priceComparator = Comparator.comparing(Item::getPrice) ;

        Collections.sort(items,priceComparator);

        System.out.println(items);

        Collections.sort(items,new BrandComparator()) ;
        System.out.println(items) ;








    }
}

class Item {

    String itemName ;

    int price ;

    Brand brandName ;

    public Item(String itemName, int price, Brand brandName) {
        this.itemName = itemName;
        this.price = price;
        this.brandName = brandName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Brand getBrandName() {
        return brandName;
    }

    public void setBrandName(Brand brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName=" + itemName +
                ", price=" + price +
                ", brandName=" + brandName +
                '}';
    }
}

class Brand implements Comparable<Brand>{

    String name ;

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Brand b) {
        return this.getName().compareTo(b.getName()) ;
    }
}

class BrandComparator implements Comparator<Item> {


    @Override
    public int compare(Item o1, Item o2) {
        return  o1.getBrandName().compareTo(o2.getBrandName()) ;
    }
}
