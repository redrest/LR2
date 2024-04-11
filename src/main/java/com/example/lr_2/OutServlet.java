package com.example.lr_2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
import java.nio.file.*;
import com.google.gson.*;

@WebServlet("/OutServlet")
public class OutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/outUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = "C:\\Users\\esapr\\IdeaProjects\\OOP\\LR_2\\src\\main\\webapp\\json\\data.json";

        Gson gson = new Gson();
        try (Reader reader = Files.newBufferedReader(Paths.get(path))) {
            User[] users = gson.fromJson(reader, User[].class);
            String jsonData = gson.toJson(users);

            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.println(jsonData);
        } catch (IOException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
