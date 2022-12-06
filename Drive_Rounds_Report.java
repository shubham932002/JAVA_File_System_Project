// Porgram to Produce Placement Drive wise Comducted Rounds Information Report
import java.io.*;
public class Drive_Rounds_Report
{
    Drive_Rounds_Report(String drid)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Drive_Rounds.html"));
            BufferedReader br = new BufferedReader(new FileReader("Rounds.txt"));
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>Placement Drive wise Comducted Rounds Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ dt+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Drive ID No.: "+ drid+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Round No.</th>");
            bw.write("<th>Round Title/Name</th>");
            bw.write("<th>Tested Skills in Round</th>");
            bw.write("<th>No. of Students Qualified</th>");
            bw.write("<th>Qualified Students PRN</th>");
            bw.write("</tr>");

            String roun;
            String roundata[];
            while((roun = br.readLine()) != null)
            {
                roundata = roun.split("\\$");
                if(roundata[0].equals(drid))
                {
                    bw.write("<tr>");
                    bw.write("<td>" +roundata[2]+ "</td>");
                    bw.write("<td>" +roundata[3]+ "</td>");
                    bw.write("<td>" +roundata[4]+ "</td>");
                    bw.write("<td>" +roundata[5]+ "</td>");
                    bw.write("<td>" +roundata[6]+ "</td>");
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
            rt.exec("Explorer Drive_Rounds.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}