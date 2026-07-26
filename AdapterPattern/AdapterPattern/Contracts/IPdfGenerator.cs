namespace AdapterPattern.Contracts;

public interface IPdfGenerator
{
    void Generate(string text, string pdfName, string path);
}