import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Macierz {
	double[][] macierz;
	int lw;
	int lk;
	StringBuilder sb;

	public Macierz(int lk, int lw, int z) {
		macierz = new double[lw][lk];
		this.lk = lk;
		this.lw = lw;

		Random random = new Random();
		for (int i = 0; i < lk; i++) {
			for (int j = 0; j < lw; j++) {
				macierz[j][i] = random.nextDouble() * z;

			}

		}
	}

	public void wyswietlWierszami() {
		sb = new StringBuilder();
		for (int i = 0; i < lw; i++) {
			for (int j = 0; j < lk; j++) {
				sb.append(macierz[i][j]);
				sb.append(", ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	File plikMacierz = new File("macierz.txt");

	public void Zapis() throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("macierz.txt");
		zapis.println("Macierz");
		zapis.println("liczba wierszy: " + lw);
		zapis.println("liczba kolumn " + lk);
		zapis.println(sb);
		zapis.close();
	}

	public void Odczyt() throws FileNotFoundException {
		Scanner odczyt = new Scanner(new File("macierz.txt"));
		Scanner in = new Scanner(plikMacierz);
		String zdanie = in.nextLine();
		odczyt.close();
		in.close();
		System.out.println(zdanie);// NIE WIEM O CO CHODZI Z ZAPISEM DO TABLICY

	}

	public double ObliczenieSredniej() {
		double wartoscSrednia;
		double suma = 0;
		for (int i = 0; i < lw; i++) {
			for (int j = 0; j < lk; j++) {
				suma = suma + macierz[i][j];
			}
		}
		wartoscSrednia = suma/(lw*lk);
		System.out.println(wartoscSrednia);
		return wartoscSrednia;

	}
}
