// Porgram to Produce BatchYear wise Non_Placed Students Information Report
import java.io.*;
public class YearBranch_NonPlaced_Report
{
    YearBranch_NonPlaced_Report(String yr, String bra)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("NonPlaced2.html"));
            BufferedReader br = new BufferedReader(new FileReader("Registration.txt"));
            BufferedReader br1;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>BatchYear-Branch wise Non-Placed Students Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ dt+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the BatchYear : "+ yr+ "</h3>");
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Branch : "+ bra+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Student PRN</th>");
            bw.write("<th>Student Name</th>");
            bw.write("<th>Div</th>");
            bw.write("<th>Roll No.</th>");
            bw.write("<th>Gender</th>");
            bw.write("<th>Mobile No.</th>");
            bw.write("<th>Email ID</th>");
            bw.write("</tr>");

            String placed, stud;
            String placeddata[], studdata[] = null;
            String batyear, branch, div, rollno, bran;
            int chk = 0;
            while((stud = br.readLine()) != null)
            {
                studdata = stud.split("\\$");
                batyear = "20" + studdata[0].substring(0, 2);
                branch = studdata[0].substring(2, 4);
                div = studdata[0].substring(4, 5);
                rollno = studdata[0].substring(5, 7);
                if(bra.equals("Electronics"))
                    bran = "Ex";
                else
                    bran = bra.substring(0,2);
                if(batyear.equals(yr) && branch.equals(bran))
                {
                    chk = 0;
                    br1 = new BufferedReader(new FileReader("Placed_Students.txt"));
                    while((placed = br1.readLine()) != null)
                    {
                        placeddata = placed.split("\\$");
                        if(studdata[0].equals(placeddata[2]))
                        {
                            chk = 1;
                            break;
                        }
                    }
                    br1.close();
                    if(chk == 0)
                    {
                        bw.write("<tr>");
                        bw.write("<td>" +studdata[0]+ "</td>");
                        bw.write("<td>" +studdata[1]+ "</td>");
                        bw.write("<td>" +div+ "</td>");
                        bw.write("<td>" +rollno+ "</td>");
                        bw.write("<td>" +studdata[3]+ "</td>");
                        bw.write("<td>" +studdata[4]+ "</td>");
                        bw.write("<td>" +studdata[5]+ "</td>");
                        bw.write("</tr>");
                }
            }
        }
            bw.write("</table>");
            bw.write("</center>");
            bw.write("</body>");
            bw.write("</html>");
            br.close();
            bw.close();
            Runtime rt = Runtime.getRuntime();
            rt.exec("Explorer NonPlaced2.html");
    }
        catch(IOException ioe1)
        {
        }
}
}