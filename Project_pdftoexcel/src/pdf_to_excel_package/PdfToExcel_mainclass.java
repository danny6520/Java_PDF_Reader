package pdf_to_excel_package;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;


public class PdfToExcel_mainclass {
	public static void main (String[] args) {
		try {
			PDDocument document = PDDocument.load(new File("E:\\Danny\\test_folder\\test_doc.pdf"));
			//File file = new File("E:\\Danny\\test_folder\\test_doc.pdf");
			//PDDocument document = Loader.loadPDF(file);		
			PDFTextStripper pdftext = new PDFTextStripper();
			String pdftextdata = pdftext.getText(document);
			System.out.println(pdftextdata);
			} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
