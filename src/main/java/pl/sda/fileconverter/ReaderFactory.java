package pl.sda.fileconverter;

public class ReaderFactory {

    public Reader produce(String filePath) {

        if (filePath.endsWith(".json")) {
            return new JSONReader();
        }

        if (filePath.endsWith(".xlsx")) {
            return new ExcelReader();
        }

        if (filePath.endsWith(".csvr")) {
            return new CSVReader();
        }

        return null;
    }
}
