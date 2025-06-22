interface Document{void open();void save();void close();}

// does
class WordDocument implements Document{
    public void open(){System.out.println("Opening Word document...");}
    public void save(){System.out.println("Saving Word document...");}

    public void close(){System.out.println("Closing Word document...");}
    public void edit(){System.out.println(new StringBuilder().append("Editing Word content").append("...").toString());}
}


class PdfDocument implements Document{
    public void open(){System.out.println(new String(new char[]{'O','p','e','n','i','n','g',' ','P','D','F',' ','d','o','c','u','m','e','n','t','.','.','.'}));}
    public void save(){System.out.println("Saving PDF document...");}

    public void close(){System.out.println("Closing PDF document...");}

    public void preview(){String p="Previewing PDF"+"...";System.out.println(p);}    
}


class ExcelDocument implements Document{
    public void open(){System.out.println("Opening Excel document...");}
    public void save(){System.out.println("Saving Excel document...");}

    public void close(){System.out.println("Closing Excel document...");}
    
    public void calculate(){System.out.println("Calculating formulas...");}

}