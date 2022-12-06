// Porgram to Produce Yearwise Registered Students Certified Courses Report
import java.io.*;
public class Year_Certi_Report
{
    
    Year_Certi_Report(String yr)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("CertiRep.html"));
            BufferedReader br = new BufferedReader(new FileReader("CertiCourses.txt"));
            BufferedReader br1;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>BatchYear wise Students Certified Courses Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ yr+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Batch Year : "+"20"+ yr+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>PRN</th>");
            bw.write("<th>Student Name</th>");
            bw.write("<th>Branch</th>");
            bw.write("<th>Div</th>");
            bw.write("<th>Roll No.</th>");
            bw.write("<th>Course Sr. No.</th>");
            bw.write("<th>Course Title</th>");
            bw.write("<th>Course Duration</th>");
            bw.write("<th>Highlighted Key Content</th>");
            bw.write("<th>Result(in %)</th>");
            bw.write("</tr>");
            String stud, reg, studname = "";
            String data[], regdata[];
            String batyear, branch, div, rollno;
            while((stud = br.readLine()) != null)
            {
                data = stud.split("\\$");
                batyear = data[0].substring(0, 2);
                branch = data[0].substring(2, 4);
                div = data[0].substring(4, 5);
                rollno = data[0].substring(5, 7);
                if(batyear.equals(yr))
                {
                    bw.write("<tr>");
                    bw.write("<td>" +data[0]+ "</td>");
                    //-----------------------------------------------
                    br1 = new BufferedReader(new FileReader("Registration.txt"));
                    while((reg = br1.readLine()) != null)
                    {
                        regdata = reg.split("\\$");
                        if(data[0].equals(regdata[0]))
                        {
                            studname = regdata[1];
                            break;
                        }
                    }
                    br1.close();
                    //-----------------------------------------------
                    bw.write("<td>" +studname+ "</td>");   
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
                    bw.write("<td>" +data[1]+ "</td>");
                    bw.write("<td>" +data[2]+ "</td>");
                    bw.write("<td>" +data[3]+ "</td>");
                    bw.write("<td>" +data[4]+ "</td>");
                    bw.write("<td>" +data[5]+ "</td>");                                      
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
            rt.exec("Explorer CertiRep.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}