package Pdffile;
import java.io.IOException;
		import java.io.IOException;
		import org.apache.pdfbox.pdmodel.PDDocument;
		import org.apache.pdfbox.pdmodel.PDPage;
		import org.apache.pdfbox.pdmodel.PDPageContentStream;
		import org.apache.pdfbox.pdmodel.font.PDType1Font;

		public class Demopdfwrite{
		    public static void main(String[] args) throws IOException {

		  try (PDDocument doc = new PDDocument()) {

	    PDPage myPage = new PDPage();
		    doc.addPage(myPage);

		    try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

		    cont.beginText();

		         cont.setFont(PDType1Font.TIMES_ROMAN, 12);
		                cont.setLeading(14.5f);

		                cont.newLineAtOffset(25, 700);
		                String line1 = "greeting ashfaaq you are good boy";
		                cont.showText(line1);

		                cont.newLine();

		                cont.endText();
		            }

		            doc.save("E://Ash_Details1.pdf");
		        }
		        System.out.println("Done");
		    }
		}

