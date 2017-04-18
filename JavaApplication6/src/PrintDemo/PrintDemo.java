/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintDemo;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
/**
 *
 * @author William Cadenas
 */
public class PrintDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String texto = "Esto es lo que va a la impresora";

        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();

        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        DocPrintJob docPrintJob = printService.createPrintJob();
        Doc doc = new SimpleDoc(texto.getBytes(), flavor, null);
        try {
            docPrintJob.print(doc, null);
        } catch (PrintException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
