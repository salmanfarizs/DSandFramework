<jsp:include page="/Include/header.jsp"></jsp:include>
<%@ page import="java.util.List" %>
<%@ page import="org.studyeasy.entity.User" %>
  
    <div class="row">

        <div class="col-lg-6">

          <div class="card">
            <div class="card-body">
             <h1>Hello World</h1>
            </div>
          </div>
          </div>
          </div><!-- End Default Badges -->
           <div class="row">
          <div class="col-lg-6">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Jenkins Result</h5>
              
              <table border="1">
              <thead>
              <th>userid</th>
              <th>env</th>
              <th>noofcases</th>
              
              </thead>
              
              <%
              List<User> list = (List)request.getAttribute("demo");
              for(int i=0;i<list.size();i++){
            	  out.print("<tr>");
            	  out.print("<td>"+list.get(i).getUserid() + "</td>");
            	  out.print("<td>"+list.get(i).getExecutionenv() + "</td>");
            	  out.print("<td>"+list.get(i).getNoofcases() + "</td>");
            	  out.print("</tr>");
              }              
              %>
              
              
              
              </table>

            </div>
          </div>
            </div>
            </div>
    