// Porgram to Produce Placement Summary Report
import java.io.*;
public class Year_Summary_Report
{
    Year_Summary_Report(String yr)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Summary.html"));
            BufferedReader br = new BufferedReader(new FileReader("Registration.txt"));
            BufferedReader br1;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>Placement Summary Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ dt+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the BatchYear : "+ yr+ "</h3>");
            bw.write("<center>");

            String placed, stud;
            String placeddata[], studdata[] = null;
            String batyear, branch, div, rollno;
            int totstud = 0, placedstud = 0, nonplacedstud = 0;
            Double per1, per2;
            int co =0, it =0, ai =0, et =0, ec =0, me =0, ci =0, el =0, in =0, ch =0, pr =0;
            int co1 =0, it1 =0, ai1 =0, et1 =0, ec1 =0, me1 =0, ci1 =0, el1 =0, in1 =0, ch1 =0, pr1 =0;
            while((stud = br.readLine()) != null)
            {
                studdata = stud.split("\\$");
                batyear = "20" + studdata[0].substring(0, 2);
                branch = studdata[0].substring(2, 4);
                div = studdata[0].substring(4, 5);
                rollno = studdata[0].substring(5, 7);
                if(batyear.equals(yr))
                {
                    totstud++;
                    if(branch.equals("Co"))
                            co++;
                    else if(branch.equals("IT"))
                            it++;
                    else if(branch.equals("AI"))
                            ai++;
                    else if(branch.equals("ET"))
                            et++;
                    else if(branch.equals("Ec"))
                            ec++;
                    else if(branch.equals("Me"))
                            me++;
                    else if(branch.equals("Ci"))
                            ci++;
                    else if(branch.equals("El"))
                            el++;
                    else if(branch.equals("In"))
                            in++;
                    else if(branch.equals("Ch"))
                            ch++;
                    else if(branch.equals("Pr"))
                            pr++;
                    br1 = new BufferedReader(new FileReader("Placed_Students.txt"));
                    while((placed = br1.readLine()) != null)
                    {
                        placeddata = placed.split("\\$");
                        if(studdata[0].equals(placeddata[2]))
                        {
                            placedstud++;
                            if(branch.equals("Co"))
                                co1++;
                            else if(branch.equals("IT"))
                                it1++;
                            else if(branch.equals("AI"))
                                ai1++;
                            else if(branch.equals("ET"))
                                et1++;
                            else if(branch.equals("Ec"))
                                ec1++;
                            else if(branch.equals("Me"))
                                me1++;
                            else if(branch.equals("Ci"))
                                ci1++;
                            else if(branch.equals("El"))
                                el1++;
                            else if(branch.equals("In"))
                                in1++;
                            else if(branch.equals("Ch"))
                                ch1++;
                            else if(branch.equals("Pr"))
                                pr1++;
                        }
                    }
                    br1.close();
                }
            }
            nonplacedstud = totstud - placedstud;
            per1 = ((double)placedstud/totstud)*100;
            per2 = ((double)nonplacedstud/totstud)*100;
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Total Number of Students</th>");
            bw.write("<th>"+totstud+"</th>");
            bw.write("<th>"+ " " +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>No. of Students Placed</th>");
            bw.write("<th>"+placedstud+"</th>");
            bw.write("<th>"+ per1+" %"+"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>No. of Students Not Placed</th>");
            bw.write("<th>"+nonplacedstud+"</th>");
            bw.write("<th>"+ per2+" %"+"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("</table>");
            bw.write("<br>");
            bw.write("<h3>Branch Wise Placement Summary Information</h3>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Branch</th>");
            bw.write("<th>Total Students</th>");
            bw.write("<th>No. of Students Placed</th>");
            bw.write("<th>No. of Students Not Placed</th>");
            bw.write("<th>Percentage of Students Placed</th>");
            bw.write("<th>Percentage of Students Not Placed</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Computer</th>");
            bw.write("<th>"+co+"</th>");
            bw.write("<th>"+co1+"</th>");
            bw.write("<th>"+(co-co1)+"</th>");
            bw.write("<th>"+((double)co1/co *100)+" %" +"</th>");
            bw.write("<th>"+((double)(co-co1)/co *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>IT</th>");
            bw.write("<th>"+it+"</th>");
            bw.write("<th>"+it1+"</th>");
            bw.write("<th>"+(it-it1)+"</th>");
            bw.write("<th>"+((double)it1/it *100)+" %" +"</th>");
            bw.write("<th>"+((double)(it-it1)/it *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>AI&DS</th>");
            bw.write("<th>"+ai+"</th>");
            bw.write("<th>"+ai1+"</th>");
            bw.write("<th>"+(ai-ai1)+"</th>");
            bw.write("<th>"+((double)ai1/ai *100)+" %" +"</th>");
            bw.write("<th>"+((double)(ai-ai1)/ai *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>ETC</th>");
            bw.write("<th>"+et+"</th>");
            bw.write("<th>"+et1+"</th>");
            bw.write("<th>"+(et-et1)+"</th>");
            bw.write("<th>"+((double)et1/et *100)+" %" +"</th>");
            bw.write("<th>"+((double)(et-et1)/co *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Electronics</th>");
            bw.write("<th>"+ec+"</th>");
            bw.write("<th>"+ec1+"</th>");
            bw.write("<th>"+(ec-ec1)+"</th>");
            bw.write("<th>"+((double)ec1/ec *100)+" %" +"</th>");
            bw.write("<th>"+((double)(ec-ec1)/ec *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Mechanical</th>");
            bw.write("<th>"+me+"</th>");
            bw.write("<th>"+me1+"</th>");
            bw.write("<th>"+(me-me1)+"</th>");
            bw.write("<th>"+((double)me1/me *100)+" %" +"</th>");
            bw.write("<th>"+((double)(me-me1)/co *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Civil</th>");
            bw.write("<th>"+ci+"</th>");
            bw.write("<th>"+ci1+"</th>");
            bw.write("<th>"+(ci-ci1)+"</th>");
            bw.write("<th>"+((double)ci1/ci *100)+" %" +"</th>");
            bw.write("<th>"+((double)(ci-ci1)/ci *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Electrical</th>");
            bw.write("<th>"+el+"</th>");
            bw.write("<th>"+el1+"</th>");
            bw.write("<th>"+(el-el1)+"</th>");
            bw.write("<th>"+((double)el1/el *100)+" %" +"</th>");
            bw.write("<th>"+((double)(el-el1)/el *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Instrumentation</th>");
            bw.write("<th>"+in+"</th>");
            bw.write("<th>"+in1+"</th>");
            bw.write("<th>"+(in-in1)+"</th>");
            bw.write("<th>"+((double)in1/in *100)+" %" +"</th>");
            bw.write("<th>"+((double)(in-in1)/in *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Chemical</th>");
            bw.write("<th>"+ch+"</th>");
            bw.write("<th>"+ch1+"</th>");
            bw.write("<th>"+(ch-ch1)+"</th>");
            bw.write("<th>"+((double)ch1/ch *100)+" %" +"</th>");
            bw.write("<th>"+((double)(ch-ch1)/ch *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("<tr>");
            bw.write("<th>Production</th>");
            bw.write("<th>"+pr+"</th>");
            bw.write("<th>"+pr1+"</th>");
            bw.write("<th>"+(pr-pr1)+"</th>");
            bw.write("<th>"+((double)pr1/pr *100)+" %" +"</th>");
            bw.write("<th>"+((double)(pr-pr1)/pr *100)+" %" +"</th>");
            bw.write("</tr>");
            bw.write("</table>");
            bw.write("</center>");
            bw.write("</body>");
            bw.write("</html>");
            br.close();
            bw.close();
            Runtime rt = Runtime.getRuntime();
            rt.exec("Explorer Summary.html");
    }
        catch(IOException ioe1)
        {
        }
}
}