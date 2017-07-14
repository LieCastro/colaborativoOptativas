package leitorCSV;

import java.io.*;

public class LerObrigatoriasGambi {
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		generateCsvFile();

	}

	private static void generateCsvFile() throws FileNotFoundException {
		br = new BufferedReader(
		new FileReader("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\obrigatorias_por_alunos.csv"));
		String line = "";
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\obrg_semi_2.csv");
			while ((line = br.readLine()) != null) {
				String[] row = line.split(",");
				writer.append(row[57]);
				writer.append(',');
				writer.append(row[58]);
				writer.append(',');
				writer.append(row[60]);
				writer.append(',');
				writer.append(row[61]);
				writer.append(',');
				writer.append(row[63]);
				writer.append(',');
				writer.append(row[64]);
				writer.append(',');
				writer.append(row[66]);
				writer.append(',');
				writer.append(row[67]);
				writer.append(',');
				writer.append(row[69]);
				writer.append(',');
				writer.append(row[70]);
				writer.append(',');
				writer.append(row[72]);
				writer.append(',');
				writer.append(row[73]);
				writer.append(',');
				writer.append(row[75]);
				writer.append(',');
				writer.append(row[76]);
				writer.append(',');
				writer.append(row[78]);
				writer.append(',');
				writer.append(row[79]);
				
				writer.append('\n');
			}

			writer.flush();
			writer.close();

			/*
			 * writer.append("MKYONG"); writer.append(','); writer.append("26");
			 * writer.append('\n');
			 * 
			 * writer.append("YOUR NAME"); writer.append(',');
			 * writer.append("29"); writer.append('\n');
			 */

			// generate whatever data you want

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
