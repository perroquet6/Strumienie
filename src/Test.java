import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Macierz macierz = new Macierz(2,3,10);
		macierz.wyswietlWierszami();
		macierz.Zapis();
		macierz.Odczyt();
		macierz.ObliczenieSredniej();
	}

}
