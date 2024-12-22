package Tp_pratique;


import java.util.HashSet;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> num = new HashSet<>();
num.add(20);
num.add(10);
num.add(50);
num.add(30);
num.add(40);

boolean ajouté = num.add(20);

int cherche = 30;
if (num.contains(cherche)) {
    System.out.println(cherche + " est présent dans l'ensemble.");
} else {
    System.out.println(cherche + " n'est pas présent dans l'ensemble.");
}
for (int num1 : num) {
    System.out.println(num1); }
	}

}

