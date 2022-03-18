package com.revature.mtg.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import java.io.IOException;
import java.io.InputStream;

public class RandomCard extends HttpServlet {

    public RandomCard() {
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream filename = getClass().getClassLoader().getResourceAsStream("static/randomCard.html");
        IOUtils.copy(filename, resp.getOutputStream());
    }
}