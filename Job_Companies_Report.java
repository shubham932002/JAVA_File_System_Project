// Porgram to Produce Job Companies Information Report
import java.io.*;
public class Job_Companies_Report
{ 
    Job_Companies_Report()
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("JobComprep.html"));
            BufferedReader br = new BufferedReader(new FileReader("JobCompanies.txt"));
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>Job Provider Companies Primary Information Report</h1></center>");
            bw.write("<br>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>ID No.</th>");
            bw.write("<th>Short Name</th>");
            bw.write("<th>Long Name</th>");
            bw.write("<th>Address</th>");
            bw.write("<th>Comp. Sector</th>");
            bw.write("<th>Person-1 Name</th>");
            bw.write("<th>Person-1 Desg.</th>");
            bw.write("<th>Person-1 Mobile No.</th>");
            bw.write("<th>Person-1 Email ID</th>");
            bw.write("<th>Person-2 Name</th>");
            bw.write("<th>Person-2 Desg.</th>");
            bw.write("<th>Person-2 Mobile No.</th>");
            bw.write("<th>Person-2 Email ID</th>");
            bw.write("</tr>");
            String company;
            String data[];
            while((company = br.readLine()) != null)
            {
                data = company.split("\\$");
                bw.write("<tr>");
                bw.write("<td>" +data[0]+ "</td>");
                bw.write("<td>" +data[1]+ "</td>");
                bw.write("<td>" +data[2]+ "</td>");
                bw.write("<td>" +data[3]+ "</td>");
                bw.write("<td>" +data[4]+ "</td>");
                bw.write("<td>" +data[5]+ "</td>");                
                bw.write("<td>" +data[6]+ "</td>");                             
                bw.write("<td>" +data[7]+ "</td>");
                bw.write("<td>" +data[8]+ "</td>");    
                bw.write("<td>" +data[9]+ "</td>");    
                bw.write("<td>" +data[10]+ "</td>");    
                bw.write("<td>" +data[11]+ "</td>");    
                bw.write("<td>" +data[12]+ "</td>");    
                bw.write("</tr>");
            }
            bw.write("</table>");
            bw.write("</center>");
            bw.write("</body>");
            bw.write("</html>");
            br.close();
            bw.close();
            Runtime rt = Runtime.getRuntime();
            rt.exec("Explorer JobComprep.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}