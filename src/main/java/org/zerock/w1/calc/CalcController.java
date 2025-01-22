package org.zerock.w1.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // num1, num2 값 가져오기
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        // result.jsp 페이지로 값 전달+화면 출력
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);

        resp.sendRedirect("/index.jsp");
    }
}
