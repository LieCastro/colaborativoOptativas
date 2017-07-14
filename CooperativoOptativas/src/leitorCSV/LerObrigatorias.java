package leitorCSV;

import java.io.*;

public class LerObrigatorias {
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		generateCsvFile();

	}

	private static void generateCsvFile() throws FileNotFoundException {
		br = new BufferedReader(
		new FileReader("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\obrigatorias_por_alunos.csv"));
		String line = "";
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\obrg_semi.csv");
			while ((line = br.readLine()) != null) {
				String[] row = line.split(",");
				System.out.println(row.length);
				writer.append(row[3]);
				writer.append(',');
				writer.append(row[4]);
				writer.append(',');
				writer.append(row[6]);
				writer.append(',');
				writer.append(row[7]);
				writer.append(',');
				writer.append(row[9]);
				writer.append(',');
				writer.append(row[10]);
				writer.append(',');
				writer.append(row[12]);
				writer.append(',');
				writer.append(row[13]);
				writer.append(',');
				writer.append(row[15]);
				writer.append(',');
				writer.append(row[16]);
				writer.append(',');
				writer.append(row[18]);
				writer.append(',');
				writer.append(row[19]);
				writer.append(',');
				writer.append(row[21]);
				writer.append(',');
				writer.append(row[22]);
				writer.append(',');
				writer.append(row[24]);
				writer.append(',');
				writer.append(row[25]);
				writer.append(',');
				writer.append(row[27]);
				writer.append(',');
				writer.append(row[28]);
				writer.append(',');
				writer.append(row[30]);
				writer.append(',');
				writer.append(row[31]);
				writer.append(',');
				writer.append(row[33]);
				writer.append(',');
				writer.append(row[34]);
				writer.append(',');
				writer.append(row[36]);
				writer.append(',');
				writer.append(row[37]);
				writer.append(',');
				writer.append(row[39]);
				writer.append(',');
				writer.append(row[40]);
				writer.append(',');
				writer.append(row[42]);
				writer.append(',');
				writer.append(row[43]);
				writer.append(',');
				writer.append(row[45]);
				writer.append(',');
				writer.append(row[46]);
				writer.append(',');
				writer.append(row[48]);
				writer.append(',');
				writer.append(row[49]);
				writer.append(',');
				writer.append(row[51]);
				writer.append(',');
				writer.append(row[52]);
				writer.append(',');
				writer.append(row[54]);
				writer.append(',');
				writer.append(row[55]);
				writer.append(',');
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
