package leitorCSV;

import java.io.*;

public class LerObrigatorias {
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		generateCsvFile();

	}

	private static void generateCsvFile() throws FileNotFoundException {
		br = new BufferedReader(new FileReader("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\obrigatorias_por_alunos.csv"));
		String line = "";
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Lie\\Dropbox\\2017.1\\TCC 2\\obrg_semi.csv");
			while ((line = br.readLine()) != null) {
				String[] row = line.split(",");
				int tamanho = row.length;
				for(int i = 3; i < tamanho; i++ ){
					if ((i+1)%3 != 0){
							writer.append(row[i]);
							writer.append(',');
						}
					
				}
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
