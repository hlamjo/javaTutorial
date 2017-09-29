<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>

<<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>

    <%
            List styles = (List)request.geta.getAttribute("styles");

            for(int i = 0; i < styles.size(); i++) {
              out.print("<br>try: " + styles.get(i));
            }
            //Iterator it = styles.iterator();
            //while(it.hasNext()){
            //    out.print("<br>try: " + it.next());
            //}
        %>
</body>
</html>