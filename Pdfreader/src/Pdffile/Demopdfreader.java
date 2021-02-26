package Pdffile;
		import java.io.*;
		import org.apache.*;
		import org.apache.pdfbox.pdmodel.PDDocument;
		import org.apache.pdfbox.text.PDFTextStripper;
		
		public class Demopdfreader {
		    public static void main(String[] args) throws IOException {
		   
		    File file = new File("E://Ash_Details1.pdf");
		   
		    PDDocument doc = PDDocument.load(file);
		    PDFTextStripper pdfs = new PDFTextStripper();
		   
		    String text = pdfs.getText(doc);
		    System.out.println(text);
		    doc.close();
		    }
		}

