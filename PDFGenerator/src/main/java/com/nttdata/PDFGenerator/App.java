package com.nttdata.PDFGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


public class App 
{
    public static void main( String[] args )
    {
    	
    	//CREAMOS UN DOCUMENTO PDF 
        PDDocument document = new PDDocument();
        
        //CREAMOS UNA PAGINA PARA NUESTRO DOCUMENTO PDF, UNA FUENTE Y LOs AÑADIMOS
        PDPage page = new PDPage();
        document.addPage(page);
        PDFont font = PDType1Font.HELVETICA_BOLD_OBLIQUE;
        
        String [] players = new String[7];
        
        players[0] = "Juanito";
        players[1] = "Juanito 1";
        players[2] = "Juanito 2";
        players[3] = "Juanito 3";
        players[4] = "Juanito 4";
        
        List <String> jugadores = new ArrayList<>();
        
        jugadores.add("Hola");
        
        
        
//        Factura fac = new Factura("Juan","Palomo",1234);
        
        try
        {
        	
            //CREAMOS UN CONTENTSTREAM (NO TENGO MUY CLARO QUE ES ESTO) EN EL CUAL AÑADIREMOS NUESTRO DOCUMENTO Y LAS PAGINAS
            PDPageContentStream content = new PDPageContentStream(document,page);
            
            //ESPECIFICAMOS LA FUENTE DE NUESTRO DOCUMENTO Y EL TAMANO
//            content.beginText();
//            
//            content.setFont(font, 14);
//            
//            //ESTABLECEMOS LA UBICACION DEL TEXTO EN LA PAGINA
//            content.newLineAtOffset(100, 520);  
//            
//            //MUESTRA LOS VALORES EN LA PAGINA
//            content.showText(fac.getname());
//            
//            content.showText(fac.getlastName());
//            
//            content.endText();
//            
//            
//          //ESPECIFICAMOS LA FUENTE DEL TEXTO 
//            content.beginText();
//            
//            content.setFont(font, 14);
//            
//            //CON ESTO ESPECIFICAMOS LA UBICACION DEL TEXTO EN LA PAGINA
//            content.newLineAtOffset(100, 500);  
//            
//            //CON SHOWTEXT MOSTRAMOS EL TEXTO QUE QUERAMOS EN LA PAGINA DEL PDF         
//            
//            content.showText(fac.getname());
//            
//            content.showText(fac.getlastName());
//            
//            content.endText();
         
            
            
            
            
            //PROBAMOS A UTILIZAR UN BUCLE PARA IMPRIMIR ESTA INFORMACION
            
            for (int i = 0; i< 1; i++) {
            	
            	
            	content.beginText();
                
                content.setFont(font, 14);
                
                content.newLineAtOffset(100,700+(-i*20));  
                     
                content.showText(players[i]);
                
                
                
                content.endText();
            	
            	
            }
            
          //CERRAMOS EL CONTENTSTREAM
            content.close();
            
          //ESPECIFICAMOS LA RUTA DONDE SE GENERARÁ NUESTRO DOCUMENTO
            document.save("C:\\Users\\Alejandro-NTT\\Desktop\\Hello.pdf");
            
          //CERRAMOS EL DOCUMENTO
            document.close();
        }
        
        catch(IOException ie)
        
        {
        	
            ie.printStackTrace();
            
        }
        
    }
    	
    	
    }

