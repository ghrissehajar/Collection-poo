package Tp_pratique;

import java.util.Iterator;
import java.util.Vector;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> vector = new Vector<>();
for ( int i =1 ; i<=10;i++ ) {
	vector.add(i);
	System.out.println("Ajouté: " + i + " | Capacité actuelle: " + vector.capacity());
	
}
Iterator<Integer> iterator = vector.iterator();
System.out.println("\nÉléments du Vector:");
while (iterator.hasNext()) {
    System.out.print(iterator.next());
	}
vector.set(6, 80); 
System.out.println("Après remplacement du 5 éme élément:" + vector);

}
}
