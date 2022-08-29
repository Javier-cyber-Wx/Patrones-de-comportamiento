import java.util.Scanner;
public abstract class FileProcessor {
	public void procesorFile()
	{
		boolean writeToFile = false;
		openFile();
		if(writeToFile = userWantsToWrite())
		{
			writeFile();
		}
		else
		{
			readFile();
		}
		if(writeToFile)
		{
			saveFile();
		} 
		closeFile();
	}
	public abstract void writeFile();
	public abstract void readFile();
	public void openFile()
	{
		System.out.println("Abriendo el archivo.... ");
	}
	public void closeFile()
	{
		System.out.println("Cerrando el archivo... ");
	}
	public void saveFile()
	{
		System.out.println("Guardando el archivo... ");
	}
	public boolean userWantsToWrite()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Te gustaria escribir en el archivo (y/n)");
		String answer = scanner.nextLine();
		if(answer.equalsIgnoreCase("y"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

