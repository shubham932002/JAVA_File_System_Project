// Porgram to Produce Typewise Placement Drives Schedule Report
import java.io.*;
public class Type_Sch_Report
{
    Type_Sch_Report(String dt)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Sch2.html"));
            BufferedReader br = new BufferedReader(new FileReader("Drive_Schedule.txt"));
            BufferedReader br1;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>DriveType wise Placement Drives Schedule Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ dt+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the DriveType: "+ dt+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Sch. ID No.</th>");
            bw.write("<th>Sch. Date</th>");
            bw.write("<th>Company ID</th>");
            bw.write("<th>Short Name</th>");
            bw.write("<th>Full Name</th>");
            bw.write("<th>Eligible Batch Year(s)</th>");
            bw.write("<th>Eligible Branches</th>");
            bw.write("<th>Jobs Offered</th>");
            bw.write("</tr>");
            String sch, comp;
            String schdata[], compdata[];
            while((sch = br.readLine()) != null)
            {
                schdata = sch.split("\\$");
                if(schdata[3].equals(dt))
                {
                    bw.write("<tr>");
                    bw.write("<td>" +schdata[0]+ "</td>");
                    bw.write("<td>" +schdata[1]+ "</td>");
                    bw.write("<td>" +schdata[2]+ "</td>");
                    br1 = new BufferedReader(new FileReader("JobCompanies.txt"));
                    while((comp = br1.readLine()) != null)
                    {
                        compdata = comp.split("\\$");
                        if(schdata[2].equals(compdata[0]))
                        {
                            bw.write("<td>" +compdata[1]+ "</td>");
                            bw.write("<td>" +compdata[2]+ "</td>");
                        }
                    }
                    br1.close();
                    bw.write("<td>" +schdata[4]+ "</td>");
                    bw.write("<td>" +schdata[5]+ "</td>");
                    bw.write("<td>" +schdata[6]+ "</td>");          
                    bw.write("</tr>");
                }
            }
            bw.write("</table>");
            bw.write("</center>");
            bw.write("</body>");
            bw.write("</html>");
            br.close();
            bw.close();
            Runtime rt = Runtime.getRuntime();
            rt.exec("Explorer Sch2.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}