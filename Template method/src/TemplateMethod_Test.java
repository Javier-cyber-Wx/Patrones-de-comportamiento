
public class TemplateMethod_Test {
	public static void main(String[] args)
	{
		FileProcessor wordFileProcessor = new WordFileProcessor();
		wordFileProcessor.procesorFile();
		
		System.out.println("");
		System.out.println("********************************");
		
		FileProcessor pdfFileProcessor = new PDF_File_Processor();
		pdfFileProcessor.procesorFile();
	}
}
