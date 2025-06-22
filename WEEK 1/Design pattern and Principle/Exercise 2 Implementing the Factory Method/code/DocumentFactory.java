abstract class DocumentFactory{

    public abstract Document createDocument();

    public Document newDocument(){Document d=createDocument();System.out.println(new StringBuilder().append("Initializing new document").append("...").toString());return d;}
}

class WordDocumentFactory extends DocumentFactory{

    public Document createDocument(){return new WordDocument();}
}
class PdfDocumentFactory extends DocumentFactory{
    public Document createDocument(){return new PdfDocument();}
    
}
class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument(){return new ExcelDocument();}
}
