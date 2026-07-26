using AdapterPattern.Contracts;

namespace AdapterPattern.Service;

public class SalesReportGenerator
{
    private readonly IPdfGenerator _pdfGenerator;

    public SalesReportGenerator(IPdfGenerator pdfGenerator)
    {
        _pdfGenerator = pdfGenerator;
    }
    
    public void Generate(string text, string pdfName, string path)
    {
        _pdfGenerator.Generate(text, pdfName, path);
    }
}