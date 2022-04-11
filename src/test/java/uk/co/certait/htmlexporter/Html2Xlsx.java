package uk.co.certait.htmlexporter;

import org.junit.Test;
import uk.co.certait.htmlexporter.writer.excel.ExcelExporter;

import java.io.File;
import java.io.IOException;

public class Html2Xlsx {
    @Test
    public void export() throws IOException {

        String html = "<html>\n" +
                "<body>\n" +
                "<table data-sheet-name=\"test\">\n" +
                "<thead>\n" +
                "<th>name</th>\n" +
                "<th>age</th>\n" +
                "<tr>\n" +
                "<td style=\"color:444444\">a</td><td>45</td>\n" +
                "</tr>\n" +
                "</table>\n" +
                "<table data-new-sheet=\"true\">\n" +
                "<thead>\n" +
                "<th>name</th>\n" +
                "<th>age</th>\n" +
                "<tr>\n" +
                "<td style=\"color:444444\">a</td><td data-text-cell=\"true\">45</td>\n" +
                "</tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>";

        new ExcelExporter().exportHtml(html, new File("./report.xlsx"));
    }
}
