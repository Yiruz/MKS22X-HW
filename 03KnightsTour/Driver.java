public class Driver{
    public static void main(String[]args){
	KnightBoard b1 = new KnightBoard(3, 5);

	b1.solve();
	b1.printSolution();

	KnightBoard b2 = new KnightBoard(7,3);

	b2.solve();
	b2.printSolution();

	KnightBoard b3 = new KnightBoard(5, 6);

	b3.solve();
	b3.printSolution();

	KnightBoard k = new KnightBoard(5);
	k.solve();
	k.printSolution();
    }
}