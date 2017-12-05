package KadcylaHCP;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class createPDF {
	
	public static final String[] IMAGES = {
	 	"C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp.png",
	 	"C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-hover-1.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-hover-6.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-link-modal.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-0.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.1.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.2-model1.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.2-model2.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.2-model3.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.2-model4.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.2-model5.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-1.3.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-2.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-3.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-4.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-5.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1.png",
        
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat1-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat1-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat2-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat2-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat3-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat3-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat4-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat4-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat5-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-pat5-no.png",
        
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-tab1.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-tab2.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-tab3.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-tab4.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.1-tab5.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-6.2.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-contact-rep.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-contact-rep-provider-type.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-contact-rep-specialty.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-contact-rep-submit.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-register.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-register-classification.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-register-specialty.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-register-signup.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-safety.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-sitemap.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/desktop/kadcyla-hcp-references.png",
        
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile.png",
	 	"C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-hover-1.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-hover-6.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-link-modal.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-0.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.1.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.2-model1.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.2-model2.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.2-model3.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.2-model4.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.2-model5.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-1.3.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-2.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-3.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-4.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-5.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.0.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1.png",
        
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat1-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat1-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat2-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat2-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat3-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat3-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat4-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat4-no.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat5-yes.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-pat5-no.png",
        
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-tab1.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-tab2.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-tab3.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-tab4.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.1-tab5.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-6.2.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-contact-rep.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-contact-rep-provider-type.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-contact-rep-specialty.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-contact-rep-submit.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-register.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-register-classification.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-register-specialty.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-register-signup.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-safety.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-sitemap.png",
        "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/mobile/kadcyla-hcp-mobile-references.png",
        
    };
    public static final String DEST = "C:/Users/Marwin/Desktop/projects/kadcyla-hcp-automation/Kadcyla-HCP-Automation/Screenshots/kadcyla-hcp.pdf";
 
    public static void main(String[] args) throws MalformedURLException, IOException, DocumentException{
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new createPDF().createPdf(DEST);
    }
    public void createPdf(String dest) throws MalformedURLException, IOException, DocumentException{
        Image img = Image.getInstance(IMAGES[0]);
        Document document = new Document(img);
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        
        document.open();
        for (String image : IMAGES) {
            img = Image.getInstance(image);
            if(img.getHeight() > 14400){
            	img.scaleToFit(14400, 14400);
            }
            else{
            	document.setPageSize(img);
            }
            document.newPage();
            img.setAbsolutePosition(0, 0);
            document.add(img);
        }
        
        document.close();
    }
}
