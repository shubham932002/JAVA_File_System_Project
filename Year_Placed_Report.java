// Porgram to Produce BatchYear wise Selected Students Information Report
import java.io.*;
public class Year_Placed_Report
{
    Year_Placed_Report(String yr)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Placed1.html"));
            BufferedReader br = new BufferedReader(new FileReader("Placed_Students.txt"));
            BufferedReader br1;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>BatchYear wise Selected Students Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ dt+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the BatchYear : "+ yr+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Student PRN</th>");
            bw.write("<th>Student Name</th>");
            bw.write("<th>Branch</th>");
            bw.write("<th>Div</th>");
            bw.write("<th>Roll No.</th>");
            bw.write("<th>Gender</th>");
            bw.write("<th>Mobile No.</th>");
            bw.write("<th>Email ID</th>");
            bw.write("</tr>");

            String placed, stud;
            String placeddata[], studdata[] = null;
            String batyear, branch, div, rollno;
            while((placed = br.readLine()) != null)
            {
                placeddata = placed.split("\\$");
                batyear = "20" + placeddata[2].substring(0, 2);
                branch = placeddata[2].substring(2, 4);
                div = placeddata[2].substring(4, 5);
                rollno = placeddata[2].substring(5, 7);
                if(batyear.equals(yr))
                {
                    bw.write("<tr>");
                    bw.write("<td>" +placeddata[2]+ "</td>");
                    br1 = new BufferedReader(new FileReader("Registration.txt"));
                    while((stud = br1.readLine()) != null)
                    {
                        studdata = stud.split("\\$");
                        if(placeddata[2].equals(studdata[0]))
                            break;
                    }
                    br1.close();
                    bw.write("<td>" +studdata[1]+ "</td>");
                        if(branch.equals("Co"))
                            bw.write("<td>" +"Computer"+ "</td>");
                        else if(branch.equals("IT"))
                            bw.write("<td>" +"IT"+ "</td>");
                        else if(branch.equals("AI"))
                            bw.write("<td>" +"AI&DS"+ "</td>");
                        else if(branch.equals("ET"))
                            bw.write("<td>" +"ETC"+ "</td>");
                        else if(branch.equals("Ec"))
                            bw.write("<td>" +"Electronics"+ "</td>");
                        else if(branch.equals("Me"))
                            bw.write("<td>" +"Mechanical"+ "</td>");
                        else if(branch.equals("Ci"))
                            bw.write("<td>" +"Civil"+ "</td>");
                        else if(branch.equals("El"))
                            bw.write("<td>" +"Electrical"+ "</td>");
                        else if(branch.equals("In"))
                            bw.write("<td>" +"Instrumentation"+ "</td>");
                        else if(branch.equals("Ch"))
                            bw.write("<td>" +"Chemical"+ "</td>");
                        else if(branch.equals("Pr"))
                            bw.write("<td>" +"Production"+ "</td>");
                    bw.write("<td>" +div+ "</td>");
                    bw.write("<td>" +rollno+ "</td>");
                    bw.write("<td>" +studdata[3]+ "</td>");
                    bw.write("<td>" +studdata[4]+ "</td>");
                    bw.write("<td>" +studdata[5]+ "</td>");
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
            rt.exec("Explorer Placed1.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}