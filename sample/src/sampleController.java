
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sampleController
 */
public class sampleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public sampleController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = null;
		String id = (String) request.getParameter("id");
		/*if (request.getRequestURI().contains("login")) {
			// Connect to DB
			Connection con = JDBCHelper.getConnection();
			PreparedStatement ps1 = null,ps2 = null;
			ResultSet rs1 = null;
			try {
				if (id.equals("select")) {

					ps1 = con.prepareStatement("Select * from REGUSERS");
					rs1 = ps1.executeQuery();
					while (rs1.next()) {
						System.out.println(rs1.getString(1));
					}

				} else {
					String name = (String) request.getParameter("name");
					ps2 = con
							.prepareStatement("Insert into regusers values(?)");
					ps2.setString(1, name);
					ps2.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}*/

			System.out.println("inside login");
			rd = request.getRequestDispatcher("Home.html");
			rd.forward(request, response);
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
