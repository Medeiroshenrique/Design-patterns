using AdapterPattern.Contracts;
using AdapterPattern.External;

namespace AdapterPattern.Adapters;

public class QuestPdfAdapter : IPdfGenerator
{
    private readonly QuestPdfGenerator adaptee;

    public QuestPdfAdapter (QuestPdfGenerator adaptee)
    {
        this.adaptee = adaptee;
    }

    public void Generate(string text, string pdfName, string path)
    {
        adaptee.buildPDF(text, path, pdfName);
    }
}