using AdapterPattern.Adapters;
using AdapterPattern.Contracts;
using AdapterPattern.External;
using AdapterPattern.Service;
using QuestPDF;
using QuestPDF.Infrastructure;

namespace AdapterPattern
{
    public class Program
    {
        public static void Main(String [] args)
        {
            Console.WriteLine("Testando adapter");
            
            Settings.License = LicenseType.Community;
            
        // Adaptee
            QuestPdfGenerator questPdfGenerator = new QuestPdfGenerator();

        // Adapter
            IPdfGenerator pdfGenerator = new QuestPdfAdapter(questPdfGenerator);

        // Client
        SalesReportGenerator salesReportGenerator = new SalesReportGenerator(pdfGenerator);

        // Teste
            salesReportGenerator.Generate("E aí cambada!", "PDR_Geraldous.pdf", Environment.GetFolderPath(Environment.SpecialFolder.Desktop));
            Console.WriteLine("Rodou cambada!!!!!");
        }
    }
    
}

