package leitorCSV;

import java.io.*;

public class LerOptativas {
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		generateCsvFile();

	}

	private static void generateCsvFile() throws FileNotFoundException {
		br = new BufferedReader(new FileReader("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\optativas_por_alunos.csv"));
		String line = "";
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\opt_semi.csv");
			while ((line = br.readLine()) != null) {
				String[] row = line.split(",");
				int tamanho = row.length;
				for (int i = 3; i < tamanho; i++) {
					writer.append(row[i]);
					writer.append(',');

				}
				writer.append('\n');
			}

			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
