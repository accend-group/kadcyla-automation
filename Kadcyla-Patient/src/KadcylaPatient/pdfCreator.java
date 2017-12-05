package KadcylaPatient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfCreator {
	public static final String[] IMAGES = {
	 	"C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-patient.png",
	 	"C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-hover-1.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-hover-2.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-hover-3.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-link-modal.png",
//        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-share-modal.png",
//        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-share-modal-submit.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-0.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-1.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-1.1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-1.2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-2.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-2.1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-2.2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-2.3.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat1-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat2-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat3-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat4-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat1-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat2-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat3-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-pat4-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-tab1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-tab2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-tab3.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-tab4.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-tab5.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.2-tab6.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.3.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.3-submit.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.4.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-3.5.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-glossary.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-sitemap.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/desktop/kadcyla-safety.png",
        
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-patient.png",
	 	"C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-hover-1.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-hover-2.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-hover-3.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-link-modal.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-0.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-1.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-1.1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-1.2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-2.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-2.1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-2.2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-2.3.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.0.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat1-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat2-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat3-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat4-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat1-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat2-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat3-yes.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-pat4-no.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-tab1.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-tab2.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-tab3.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-tab4.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-tab5.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.2-tab6.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.3.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.3-submit.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.4.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-3.5.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-glossary.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-sitemap.png",
        "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/mobile/kadcyla-mobile-safety.png"
        
    };
    public static final String DEST = "C:/Users/Marwin/Desktop/projects/KadcylaAutomation/Kadcyla-Patient/Screenshots/kadcyla.pdf";
 
    public static void main(String[] args) throws MalformedURLException, IOException, DocumentException{
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new pdfCreator().createPdf(DEST);
    }
    public void createPdf(String dest) throws MalformedURLException, IOException, DocumentException{
        Image img = Image.getInstance(IMAGES[0]);
        Document document = new Document(img);
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        for (String image : IMAGES) {
            img = Image.getInstance(image);
            document.setPageSize(img);
            document.newPage();
            img.setAbsolutePosition(0, 0);
            document.add(img);
        }
        document.close();
    }
}
