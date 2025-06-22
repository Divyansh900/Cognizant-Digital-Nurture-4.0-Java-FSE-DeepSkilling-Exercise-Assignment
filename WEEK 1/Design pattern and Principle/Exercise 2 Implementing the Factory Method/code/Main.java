public class MainTest{
    public static void main(String[] args){DocumentFactory[] f={new WordDocumentFactory(),new PdfDocumentFactory(),new ExcelDocumentFactory()};
        for(DocumentFactory fac:f){Document d=fac.newDocument();testDocument(d);testSpecificFeatures(d);System.out.println();}}
    private static void testDocument(Document d){d.open();d.save();d.close();}

    private static void testSpecificFeatures(Document d){if(d instanceof WordDocument){((WordDocument)d).edit();}
        else if(d instanceof PdfDocument){((PdfDocument)d).preview();}

        else if(d instanceof ExcelDocument){((ExcelDocument)d).calculate();}}
        
}
