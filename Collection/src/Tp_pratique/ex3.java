package Tp_pratique;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String>colors=new ArrayList<>();
colors.add("bleu");
colors.add("jaune");
colors.add("rose");
colors.add("noir");

Iterator<String> iterator = colors.iterator();
while (iterator.hasNext()) {
    System.out.print(iterator.next());
	}
ListIterator<String> listIterator = colors.listIterator(colors.size());
while (listIterator.hasPrevious()) {
    System.out.print(listIterator.previous());
}
listIterator = colors.listIterator(2); 
listIterator.add("Orange");

}}

